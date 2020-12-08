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
public class ChangementCouleurFond extends Effet {
    
    public ChangementCouleurFond(int repetition, String message, Color couleurEffet, Bandeau bandeau) {
        super(repetition, message, couleurEffet, bandeau);
    }

    public Color getCouleurEffet() {
        return couleurEffet;
        
    }

    
    
    @Override
    public String toString(){
        return "ChangementCouleurFond{"+"couleur="+couleurEffet+')';
       
    }

    
    public void play(){
        for (int i=0;i<repetition;i++){
            bandeau.setMessage("repetiton n"+i+1);
            bandeau.setBackground(couleurEffet);
            bandeau.sleep(1000);
            
        bandeau.sleep(1000);
}

    }
}

  
    
