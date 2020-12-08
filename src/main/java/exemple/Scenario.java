/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;
/**
 *
 * @author johan
 */
public class Scenario {
    private ArrayList<Effet> mesEffets;
    private Bandeau bandeau;

    public Scenario( Bandeau bandeau) {
        this.mesEffets = mesEffets;
        this.bandeau = bandeau;
    }

    
    public ArrayList<Effet> getmesEffets() {
        return mesEffets;
    }

    public Bandeau getBandeau() {
        return bandeau;
    }
    public void ajouteEffet(Effet effet){
        
        this.mesEffets.add(effet); 
        
    }
        
    public void jouerEffets(){
        for(Effet effet:mesEffets){
           effet.play();
           bandeau.sleep(1000);
       }
    }

      
}

