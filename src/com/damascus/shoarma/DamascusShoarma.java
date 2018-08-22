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


// Test class met een main method
public class DamascusShoarma {

    /**
     * @param args the command line arguments
     * Main method van de test class
     */
    public static void main(String[] args) {
          
               
        // Koks
        
        // Kok #1 met constructor zonder arguments
        Kok kok = new Kok();        // Maken van een nieuw object
               
        Personeel.aantalKoks++;     // Static variable aanpassen, zodat er een 1 word opgeteld bij de variable
       
        // Kok #2 met overloaded constructer       
        Kok kok2 = new Kok(true, "Ali Osram", "Popiastraat 125", "3333AB", "Rotterdam");    // Nieuw object met arguments
        
        Personeel.aantalKoks++;     // Static variable aanpassen, zodat er een 1 word opgeteld bij de variable
        System.out.println("aantal koks = " + Personeel.aantalKoks);    // Uitprinten van het aantal koks + static variable in de output
        
        System.out.println("Kok " + "[ " + kok2.naam + " heeft een kookboek: " + kok2.kookboek + " ]");     // Uitprinten van de kok+naam en bekijkt de boolean of de kok een kookboek heeft
        
        
        
        // Bezorgers     
                
        // Bezorger 1 met constructor zonder arguments
        Bezorger bezorger1 = new Bezorger();                        // Standaard constructor naam call > ZIE MAIN METHOD CALL <
        
        Personeel.aantalBezorgers++;
        
         // Bezorger #2 met overloaded constructer 
        Bezorger bezorger = new Bezorger("Ali Baba", "Piet Jan Straat", "3187AB", "Zwijndrecht");   // Nieuw object met arguments
        Personeel.aantalBezorgers++;        // Static variable aanpassen, zodat er een 1 word opgeteld bij de variable
        System.out.println("aantal bezorgers = " + Personeel.aantalBezorgers);      // Uitprinten van het aantal bezorgers+static variable aantal
        
        System.out.println("Bezorger " + "[ " + bezorger.naam + " heeft een eigen brommer: " + bezorger.eigenBrommer + " ]");   // Uitprinten van de bezorger+naam en kijkt de boolean na of de bezorger een eigen brommer heeft
        
        
        
        
        
        
        // Klant
        
        Klant klant = new Klant();      // Nieuw object aanmaken voor Klant class
        klant.printKlant();             // Methode uitprinten in de output
                
        
        // Boordje bezorgen
        
        bezorger.bezorgBroodje();       // Bezorgen van het broodje | print de naam en een text uit van de bezorger
        klant.klantNaam();              // Bezorgen van het broodje | print de naam van de klant uit
        
        
        
    }
    
          
}
