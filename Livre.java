/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibYak;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Atef
 */
public class Livre {

    private int ISBN;
    private String titre;
    private Date publication;
    private String editeur;
    private String lots_cles;
    private ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
    private ArrayList<Est_ecrit> ecrits = new ArrayList<Est_ecrit>();
    private Reservation reservation;

    private Livre() {
    }

    public Livre(int ISBN, String titre, Date publication, String editeur, String lots_cles) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.publication = publication;
        this.editeur = editeur;
        this.lots_cles = lots_cles;
    }

    public void addExemplaire(Exemplaire e) {
        exemplaires.add(e);
    }

    public void addEstEcrit(Est_ecrit e) {
        getEcrits().add(e);
    }

    /**
     * @return the ISBN
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the publication
     */
    public Date getPublication() {
        return publication;
    }

    /**
     * @param publication the publication to set
     */
    public void setPublication(Date publication) {
        this.publication = publication;
    }

    /**
     * @return the editeur
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * @param editeur the editeur to set
     */
    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    /**
     * @return the lots_cles
     */
    public String getLots_cles() {
        return lots_cles;
    }

    /**
     * @param lots_cles the lots_cles to set
     */
    public void setLots_cles(String lots_cles) {
        this.lots_cles = lots_cles;
    }

    /**
     * @return the exemplaires
     */
    public ArrayList<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    /**
     * @return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    

    @Override
    public String toString() {
        String s = "Livre{ISBN=" + ISBN + ", Titre="+titre+", Editeur=" + editeur + ", Date_publication=" + publication + ", Auteurs=[";

        for (Est_ecrit e : getEcrits()) {
            s += e.toString() + ", ";
        }
        s += "]}";

        return s;
    }

    /**
     * @return the ecrits
     */
    public ArrayList<Est_ecrit> getEcrits() {
        return ecrits;
    }
}
