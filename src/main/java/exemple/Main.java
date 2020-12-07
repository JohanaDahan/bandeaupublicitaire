/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import static java.awt.Color.GREEN;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author johan
 */
public class Main {
     public static void main(String[] args) {
        
        
       Bandeau bandeau = new Bandeau();
       Scenario scenario = new Scenario( bandeau);
       
       scenario.ajouteEffet(new Rotate(10, "ISIS",GREEN, bandeau));
       scenario.ajouteEffet(new Zoom(5, "MUSIC", BLUE, bandeau));
       scenario.ajouteEffet(new Clignotant(2, "CLUB", BLACK, bandeau));
       
 
       
       
    }
     
    
}


