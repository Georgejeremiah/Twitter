/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruka.TwitterPoruka;



public class TwitterTest {

	Twitter twitter;
	@Before
	public void setUp() throws Exception {
		twitter=new Twitter();
	}

	
	@After
	public void tearDown() throws Exception {
		twitter=null;
	}

	
	@Test
	public void testUnesi() {
		twitter.unesi("Mika Alas", "Ja sam ribar i matematicar");
		twitter.unesi("Fjodor Mihajlovic Dostojevski", "Ja sam napisao roman Zlocin i Kazna");
		assertEquals(2,twitter.getPoruke().size());
	}

	@Test
	public void testVratiPoruke() {
		twitter.unesi("Marija Terezija", "Ja sam kraljica Pruske drzave");
		twitter.unesi("Jozef II", "Ja sam princ Pruske drzave, sin velike Marije Terezije");
		TwitterPoruka[] proba=new TwitterPoruka[2];
		proba[0].setKorisnik("Marija Terezija");
		proba[0].setPoruka("Ja sam kraljica Pruske drzave");
		proba[1].setKorisnik("Jozef II");
		proba[1].setPoruka("Ja sam princ Pruske drzave, sin velike Marije Terezije");
		assertArrayEquals(proba,twitter.vratiPoruke(3, "Pruske drzave"));
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		twitter.vratiPoruke(9, null);
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testVratiPorukeIsEmpty() {
		twitter.vratiPoruke(7, " ");
	}
}
