package com.twitter;

import java.util.LinkedList;

import com.twitter.poruka.TwitterPoruka;
/**
 * 
 * @author Georgejeremiah
 *
 */
    public class Twitter {
    	/**
    	 *  privatni atribut lista twitter poruka
    	 */
	                private LinkedList<TwitterPoruka> poruke=new LinkedList<TwitterPoruka>();
	                /**
	                 * metoda koja prima 2 parametra 
	                 * @param korisnik 
	                 * @param poruka
	                 * kreira novi objekat tipa TwitterPoruka, 
	                 * dodeljuje mu vrednosti unetih parametara i 
	                 * ubacuje taj objekat na poslednje mesto u listi
	                 */
    public void unesi(String korisnik,String poruka){
	            TwitterPoruka tp=new TwitterPoruka();
	            tp.setKorisnik(korisnik);
	            tp.setPoruka(poruka);
	            poruke.addLast(tp);
	           }
     /**
      * metoda kao ulaz prima 2 parametra:
      * @param maxBroj broj poruka sa unetim tagom koje zelimo da izlistamo
      * (istovremeno i kapacitet niza koji metoda vraca kao povratnu vrednost)
      * @param tag parametar na osnovu koga pretrazujemo listu poruka
      * @return metoda vraca niz poruka koje sadrze uneti tag
      */
    public TwitterPoruka[] vratiPoruke(int maxBroj, String tag){
    	if(tag==null || tag.isEmpty()){
    		throw new RuntimeException("Morate uneti tag");}
    	if(maxBroj<=0){
    		          maxBroj=100;}
    	int brojac=0;
    	TwitterPoruka[] rezultat=new TwitterPoruka[maxBroj];
    	for(int i=0;i<poruke.size();i++){
    		if(poruke.get(i).getPoruka().indexOf(tag)!=-1){
    			if(brojac<maxBroj){
    				rezultat[brojac+1]=poruke.get(i);
    				brojac++;
    				}
    			}
    		else{ 
    			 break;}
    	}
    	return rezultat;
    }
	public LinkedList<TwitterPoruka> getPoruke() {
		return poruke;
	}
	

}
