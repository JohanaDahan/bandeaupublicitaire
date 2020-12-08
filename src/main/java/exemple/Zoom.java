/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author johan
 */
public class Zoom extends Effet{

    public Zoom(int repetition, String message,Color couleurEffet, Bandeau bandeau) {
        super(repetition, message, couleurEffet, bandeau);
    }
    
    
    @Override
    public void play() {
        bandeau.setForeground(couleurEffet);
        bandeau.setMessage(message);
        
        for (int i = 5; i < 60 ; i+=5) {
                bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
                bandeau.sleep(100);
        }
        bandeau.sleep(1000);
    }

  
}
