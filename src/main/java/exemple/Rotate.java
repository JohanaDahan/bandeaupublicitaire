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
 

    public  class Rotate extends Effet{
       
    

    public Rotate(int repetition, String message,Color couleurEffet, Bandeau bandeau) {
        super(repetition, message, couleurEffet, bandeau);
    }

    @Override
    public void play() {
        bandeau.setMessage(this.message);
        bandeau.setForeground(couleurEffet);
        for(int r = 0; r<this.repetition;r++){
            for (int i = 0; i <= 100; i++) {
                    bandeau.setRotation(2*Math.PI*i / 100);
                    bandeau.sleep(50);
            }
        }
    }

 
    }

    