package com.twitter.poruka;
/**
 * 
 * @author Georgejeremiah 
 * Klasa sadrzi 2 atributa, gettere i settere za te atribute kao i override-ovanu klasu toString
 *
 */
public class TwitterPoruka {
    /**
     * atribut predstavlja posiljaoca poruke
     */
	private String korisnik;
	/**
	 * atribut predstavlja sadrzaj koji posiljalac salje
	 */
	private String poruka;
	/**
	 * 
	 * @return vraca vrednost atributa korisnik
	 */
	public String getKorisnik() {
		return korisnik;
	}
	/**
	 * 
	 * @param korisnik vrednost na koju se postavlja atribut korisnik
	 * @throws java.lang.RuntimeException.class Ako je uneta vrednost atributa 
	 * korisnik null ili prazan String, metoda ce baciti neproveravani izuzetak
	 * sa odgovarajucom porukom 
	 */
	public void setKorisnik(String korisnik) {
		if(korisnik==null || korisnik.equals(" ")){
			throw new RuntimeException("Ime korisnika mora biti uneto");
		}
		this.korisnik = korisnik;
	}
	/**
	 * 
	 * @return vraca sadrzaj poruke koju je korisnik ispisao
	 */
	public String getPoruka() {
		return poruka;
	}
	/**
	 * 
	 * @param poruka unosi sadrzaj poruke za datog korisnika
	 * @throws java.lang.RuntimeException.class Ako je uneta poruka
	 * null ili ako poruka sadrzi vise od 140 karaktera metoda ce baciti neproveravani izuzetak
	 * sa odgovarajucom porukom 	
	 */
	public void setPoruka(String poruka) {
		if(poruka==null || poruka.length()>140){
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");}
		this.poruka = poruka;
	}
	/**
	 * override-ovana metoda toString
	 */
	public String toString() {
		return "KORISNIK "+korisnik+" PORUKA "+ poruka;
	}
	
}
