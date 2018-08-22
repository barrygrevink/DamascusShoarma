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


// Extended class van Personeel
public class Bezorger extends Personeel{
    
    boolean eigenBrommer;       // Kijkt of de bezorger een eigen brommer heeft
    
    
    // Standaard constructor zonder arguments
    public Bezorger() {
        
        super.naam = "Ali OsRam";       // Standaard constructor naam call 
        super.adres = "Denwijk";        // Adres van de bezorger
        super.woonplaats = "Almere";    // Woonplaats van de bezorger
        super.sofinummer = 1348783812;  // Sofinummer van de bezorger
        super.salaris = 1231.15;        // Salaris van de bezorger
        
                
       // Verwijderd vanwege nieuwe methode voor het callen van het gebruik van de static variable
       // Personeel.aantalBezorgers++;    // Static variable voor het bijhouden van het aantal bezorgers.
        
        this.eigenBrommer = eigenBrommer;   // boolean voor eigen brommer
        
        
        
    }

    
    // Constructor met arguments
    public Bezorger(String naam, String adres, String postcode, String woonplaats) {
        super(naam, adres, postcode, woonplaats);       // OVERLOADED CONSTRUCTOR
        this.eigenBrommer = eigenBrommer;               // OVERLOADED CONSTRUCTOR
       
        
        
    }

        
    
    // Geeft de waarde terug of de bezorger een eigen brommer heeft
    public boolean isEigenBrommer() {
        
        
        return eigenBrommer;        // Geeft eigen brommer weer terug
    }

    // Methode om aan te geven of er een eigen brommer beschikbaar is 
    public void setEigenBrommer(boolean eigenBrommer) {
        this.eigenBrommer = eigenBrommer;       // Geeft een retour aan de variable
    }

    // Bezorgen bij klant
       
  
    public void bezorgBroodje(){
    
        System.out.println(naam + " bezorgt een broodje shoarma bij: ");        // Geeft de naam van de bezorger weer en een text
    
    
    }
           
    
    
   
    
    
}
