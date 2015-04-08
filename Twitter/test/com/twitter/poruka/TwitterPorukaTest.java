/**
 * 
 */
package com.twitter.poruka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwitterPorukaTest {

	TwitterPoruka poruka;
	@Before
	public void setUp() throws Exception {
		poruka=new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
		poruka=null;
	}

	@Test
	public void testSetKorisnik() {
		poruka.setKorisnik("Pera Peric");
		assertEquals("Pera Peric",poruka.getKorisnik());
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		poruka.setKorisnik(null);
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		poruka.setKorisnik(" ");
	}
	
	@Test
	public void testSetPoruka() {
		poruka.setPoruka("Ja volim programiranje");
		assertEquals("Ja volim programiranje", poruka.getPoruka());
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		poruka.setKorisnik(null);
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testSetPorukaVelikiBrojStringova() {
		char[] nizk=new char[180];
		poruka.setPoruka(String.copyValueOf(nizk));
	}
	
	@Test
	public void testToString() {
		poruka.setKorisnik("Zika Zikic");
		poruka.setPoruka("Ja sam streber");
		assertEquals("KORISNIK Zika Zikic PORUKA Ja sam streber",poruka.toString());
	}

}
