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


// Abstract class persoon
public abstract class Persoon { 
    
    String naam;        // String variable van de naam
    String adres;       // String variable van het adres    
    String postcode;    // String variable van de postcode
    String woonplaats;  // String variable van de woonplaats
    
   
     
    // Getter van de naam met een return functie
    public String getNaam() {
        return naam;
    }
    // Setter van de naam met een .this functie naar de variable van de naam
    public void setNaam(String naam) {
        this.naam = naam;
    }
    // Getter van het adres met een return functie
    public String getAdres() {
        return adres;
    }
    // Setter van het adres met .this functie naar de variable van het adres
    public void setAdres(String adres) {
        this.adres = adres;
    }
    // Getter van de postcode met een return functie
    public String getPostcode() {
        return postcode;
    }
    // Setter van de postcode met een .this functie naar de variable van het adres
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    // Getter van de woonplaats met een return functie
    public String getWoonplaats() {
        return woonplaats;
    }
    // Setter van de woonplaats met een .this functie naar de variable van de woonplaats
    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
    // Constructor zonder arguments
    public Persoon() {
        this.naam = naam;               // Nog bekijken of deze functie voldoet
        this.adres = adres;             // Nog bekijken of deze functie voldoet
        this.postcode = postcode;       // Nog bekijken of deze functie voldoet
        this.woonplaats = woonplaats;   // Nog bekijken of deze functie voldoet
        
        
        
    }
    // Constructor met arguments
    public Persoon(String naam, String adres, String postcode, String woonplaats) {
        this.naam = naam;               // Nog bekijken of deze functie voldoet
        this.adres = adres;             // Nog bekijken of deze functie voldoet
        this.postcode = postcode;       // Nog bekijken of deze functie voldoet
        this.woonplaats = woonplaats;   // Nog bekijken of deze functie voldoet
    }
    
 
    
}
