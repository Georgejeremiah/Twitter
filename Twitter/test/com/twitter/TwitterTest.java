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
		twitter.unesi("Mika Alas", "Ja sam ribar i matematicar");
		twitter.unesi("Fjodor Mihajlovic Dostojevski", "Ja sam napisao roman Zlocin i Kazna");
		assertEquals(2,twitter.vratiPoruke(2, "Ja").length);
		
		
	
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
