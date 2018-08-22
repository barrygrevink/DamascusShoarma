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
public class Kok extends Personeel{
    
    
    boolean kookboek;       // Boolean variable of de kok een kookboek heeft
    
    
    
    // Standaard constructor zonder arguments
    public Kok() {
        
        
        super.naam = "Martin de Vecht";             // In de Main Method is dit "Kok" als object voor de naam - geen overloaded constructor gebruikt
        super.adres = "Jacob Catsstraat 501";       // In de Main Method is dit "Kok" als object voor het adres - geen overloaded constructor gebruikt
        super.postcode = "2527BJ";                  // In de Main Method is dit "Kok" als object voor de postcode - geen overloaded constructor gebruikt
        super.woonplaats = "Den Helder";            // In de Main Method is dit "Kok" als object voor de woonplaats - geen overloaded constructor gebruikt
        super.sofinummer = 1274829332;              // In de Main Method is dit "Kok" als object voor het sofinummer - geen overloaded constructor gebruikt
        super.salaris = 1923.50;                    // In de Main Method is dit "Kok" als object voor het salaris - geen overloaded constructor gebruikt
        
        
        this.kookboek = kookboek;       // Past de variable aan
        
        
       
        
        
    }

    
    // Constructor met arguments
    public Kok(boolean kookboek, String naam, String adres, String postcode, String woonplaats) {
        super(naam, adres, postcode, woonplaats);
        
        
        
        
        this.kookboek = kookboek;       // Past de variable aan
        
        
        
        
    }
    
    
    
    // Opvragen van boolean voor het kookboek
    public boolean isKookboek() {
        return kookboek;
    }
    // Setter voor het kookboek
    public void setKookboek(boolean kookboek) {
        this.kookboek = kookboek;       // kookboek boolean
    }

    // Geeft het aantal koks terug
    public static int getAantalKoks() {
        return aantalKoks;
    }
    
    
    
    
    
    
    
    
}
