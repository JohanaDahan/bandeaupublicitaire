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
public  class Clignotant extends Effet {
    
    public Clignotant(int repetition, String message,Color couleurEffet, Bandeau bandeau) {
        super(repetition, message,couleurEffet, bandeau);
    }
    
    
    @Override
    public void play() {
        bandeau.setForeground(couleurEffet);
        bandeau.setMessage(message);
        bandeau.sleep(500);
        for (int i = 0; i <= repetition; i++) {
            bandeau.setMessage(message);
            bandeau.sleep(300);
            bandeau.setMessage("");
            bandeau.sleep(300);
        }
        bandeau.sleep(1000);
    }

    
}
    
