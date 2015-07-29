/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibYak;

import java.util.ArrayList;

/**
 *
 * @author Atef
 */
public class Auteur extends Personne {

    private ArrayList<Est_ecrit> ecrits = new ArrayList<Est_ecrit>();

    private Auteur() {
    }

    public Auteur(int cin, String nom, String prenom, String adresse_postal, String email) {
        super(cin, nom, prenom, adresse_postal, email);
    }

    @Override
    public String toString() {
        String s = "Auteur{" + super.toString() + ", Livres=[";
        for (Est_ecrit e : getEcrits()) {
            s += e.toString() + ", ";
        }
        s += "]}";
        return s;
    }

    public void addEstEcrit(Est_ecrit e) {
        getEcrits().add(e);
    }

    /**
     * @return the ecrits
     */
    public ArrayList<Est_ecrit> getEcrits() {
        return ecrits;
    }
}
