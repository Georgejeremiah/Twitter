package com.twitter;

import java.util.LinkedList;

import com.twitter.poruka.TwitterPoruka;

    public class Twitter {
	                private LinkedList<TwitterPoruka> poruke=new LinkedList<TwitterPoruka>();
    public void unesi(String korisnik,String poruka){
	            TwitterPoruka tp=new TwitterPoruka();
	            tp.setKorisnik(korisnik);
	            tp.setPoruka(poruka);
	            poruke.add(tp);
	           }
     
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
    				rezultat[brojac]=poruke.get(i);
    				brojac++;
    				}
    			}
    		else{ 
    			 break;}
    	}
    	return rezultat;
    }

}
