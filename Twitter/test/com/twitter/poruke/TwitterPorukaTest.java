/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {
	
	TwitterPoruka t;
	
	@Before
	public void setUp() throws Exception {
		t = new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetKorisnikSveOk() {
		t.setKorisnik("visnja");
		assertEquals("visnja", t.getKorisnik());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		t.setKorisnik(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		t.setKorisnik("");
	}

	@Test
	public void testSetPorukaSveOk() {
		t.setPoruka("viki car");
		assertEquals("viki car", t.getPoruka());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		t.setPoruka(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPorukaPreko140() {
		String poruka="";
		for (int i = 0; i < 50; i++) {
			poruka+="Fon";
			
		}
		t.setPoruka(poruka);
	}

	@Test
	public void testToString() {
		t.setKorisnik("visnja");
		t.setPoruka("viki car");
		assertEquals("KORISNIK:visnja PORUKA:viki car", t.toString());
	}

}
