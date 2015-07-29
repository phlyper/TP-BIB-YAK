/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bibYak;

/**
 *
 * @author Atef
 */
public class Personne {
    private int cin;
    private String nom;
    private String prenom;
    private String adresse_postal;
    private String email;

    public Personne() {
    }

    public Personne(int cin, String nom, String prenom, String adresse_postal, String email) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse_postal = adresse_postal;
        this.email = email;
    }
    
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the adresse_postal
     */
    public String getAdresse_postal() {
        return adresse_postal;
    }

    /**
     * @param adresse_postal the adresse_postal to set
     */
    public void setAdresse_postal(String adresse_postal) {
        this.adresse_postal = adresse_postal;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cin
     */
    public int getCin() {
        return cin;
    }

    /**
     * @param cin the cin to set
     */
    public void setCin(int cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Personne:{CIN="+cin+", Nom="+nom+", Prenom="+prenom+", Adresse="+adresse_postal+", Email="+email+"}";
    }
    
}
