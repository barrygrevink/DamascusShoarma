/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damascus.shoarma;   // Package naam van het project

/**
 *
 * @author Barry Grevink
 * @version 1.0
 * 
 */


// Extended class van de class Persoon
public class Klant extends Persoon {

    
    // Constructor zonder arguments
    public Klant(){
        
        super.naam = "Jan van Gaal";                // Via de variables in de class "Persoon" , is hier een verwijzing gemaakt met .super
        super.adres = "Koekenbakkerstraat 11";      // Via de variables in de class "Persoon" , is hier een verwijzing gemaakt met .super
        super.postcode = "2574AH";                  // Via de variables in de class "Persoon" , is hier een verwijzing gemaakt met .super
        super.woonplaats = "Heerenveen";            // Via de variables in de class "Persoon" , is hier een verwijzing gemaakt met .super
        
        
    
    }

    
   // Constructor met arguments
    public Klant(String naam, String adres, String postcode, String woonplaats) {
        super(naam, adres, postcode, woonplaats);   // NCode nog testen of deze in een goede omgeving werkt
    }
    
    /**
     *
     * @return
     */
    @Override       // Een override gegeven zodat de string ook in andere classes gebruikt kan worden
    
    // String toString voor het printen via een method
    public String toString() {
    
        return naam + adres + postcode + woonplaats;    // Geeft de naam,adres,postcode en woonplaats terug als de string word opgeroepen via een methode
    
    }
    
    // Print methode voor het bedanken voor het eten
    public void printKlant(){
        
        System.out.println(naam + " zegt: Harstikke bedankt voor deze heerlijke shoarma schotel!");     // Bedanken voor de schotel
    
    }
            
     // Printen van alle gegevens van een klant      
    public void printGegevens() {
    
        System.out.println(naam +"\n"+ adres + "\n"  +  postcode + " "+ woonplaats);    // Print de gegevens in de output
    
    }
    
    // Klant naam methode voor het bezorgen voor het broodje
    public void klantNaam(){
    
        System.out.println(naam);       // Klant naam printen
    
    }
    
    
}
