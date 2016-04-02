package com.twitter.poruke;

/**
 *
 * @author Visnja Stevanovic
 *
 */
public class TwitterPoruka {
	
	/**
	 * atribut korisnik
	 */
	private String korisnik;
	
	/**
	 * atribut poruka
	 */
	private String poruka;
	
	/**
	 * metoda koja vraca atribut korisnik
	 * @return korisnik
	 */
	public String getKorisnik() {
	return korisnik;
	}
	/**
	 * metoda koja postavlja atribut korisnik
	 * @param korisnik
	 * @throws RuntimeException
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik == "")
		throw new RuntimeException("Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/**
	 * metoda koja vraca atribut poruka
	 * @return poruka
	 */
	public String getPoruka() {
	return "poruka";
	}
	/**
	 * metoda koja postavlja atribut poruka
	 * @param poruka
	 * @throws RuntimeException
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || this.poruka.length()>140)
		throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	/**
	 * metoda koja vraca string sa svim atributima
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 
}
