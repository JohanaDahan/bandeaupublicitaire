/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author johan
 */ 
 

    public class Rotate extends Effet{
       
    

    public Rotate(int repetition, String message, Bandeau bandeau) {
        super(repetition, message, bandeau);
    }

    
    public void execution() {
        bandeau.setMessage(this.message);
        for(int r = 0; r<this.repetition;r++){
            for (int i = 0; i <= 50; i++) {
                    bandeau.setRotation(380*i /50);
                    bandeau.sleep(500);
            }
        }
    }
    

    }

    