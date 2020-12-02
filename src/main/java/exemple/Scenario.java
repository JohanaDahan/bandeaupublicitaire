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
    private ArrayList<Effet> listeEffets;
    private Bandeau bandeau;

    public Scenario( Bandeau bandeau) {
        this.listeEffets = listeEffets;
        this.bandeau = bandeau;
    }

    
    public ArrayList<Effet> getListeEffets() {
        return listeEffets;
    }

    public Bandeau getBandeau() {
        return bandeau;
    }
    public void ajouteEffet(Effet effet){
        
        this.listeEffets.add(effet); 
}
}
