/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;
import bandeau.Bandeau;
import java.awt.Color;
/**
 *
 * @author johan
 */
public class Effet {
    public int repetition;
    public String message;
    protected Color couleurEffet;
    Bandeau bandeau;
    

    public Effet(int repetition, String message, Color couleurEffet, Bandeau bandeau) {
        this.repetition = repetition;
        this.message = message;
        this.couleurEffet= couleurEffet;
        this.bandeau = bandeau;
        
   
   
    }
    
    
}
