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
public class Personeel extends Persoon {
    
    static int aantalKoks;          // Static variables voor het opvragen van het aantal koks
    static int aantalBezorgers;     // Static variables voor het opvragen van het aantal bezorgers
    
    int sofinummer;                 // Sofinummer van het personeel
    double salaris;                 // Salaris van het personeel    

    
    // Standaard constructor zonder arguments
    public Personeel() {
                                                   
    }

    
    // Constructor met arguments
    public Personeel(String naam, String adres, String postcode, String woonplaats) {
        super(naam, adres, postcode, woonplaats);   // OVERLOADED CONSTRUCTOR
    }   

   
    
  
    
    // Getter van het sofinummer
    public int getSofinummer() {
        return sofinummer;      // geeft het sofinummer terug
    }
    // Setter van het sofinummer
    public void setSofinummer(int sofinummer) {
        
        
        this.sofinummer = sofinummer; // Sofinummer word aangepast in de variable
    }
    // Getter van het salaris
    public double getSalaris() {
        return salaris;     // geeft het salaris terug
    }
    // Setter van het salaris
    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }
    
    
    
    
    // toString functie | Kan opgevraagd worden door een methode
    @Override
    public String toString () {
    
    
    return "aantal koks = " + aantalKoks;       // geeft het aantal koks terug 
    
    
    }

    
    
    
    
   
    
    
    
}
