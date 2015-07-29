/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibYak;

import java.util.Date;

/**
 *
 * @author Atef
 */
public class Est_ecrit {

    private Livre livre = null;
    private Auteur auteur = null;
    private Date date_edition = null;

    public Est_ecrit() {
    }

    public Est_ecrit(Livre livre, Auteur auteur, Date date_edition) {
        this.livre = livre;
        this.auteur = auteur;
        this.date_edition = date_edition;
        
        this.livre.addEstEcrit(this);
        this.auteur.addEstEcrit(this);
    }

    /**
     * @return the livre
     */
    public Livre getLivre() {
        return livre;
    }

    /**
     * @param livre the livre to set
     */
    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    /**
     * @return the auteur
     */
    public Auteur getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the date_edition
     */
    public Date getDate_edition() {
        return date_edition;
    }

    /**
     * @param date_edition the date_edition to set
     */
    public void setDate_edition(Date date_edition) {
        this.date_edition = date_edition;
    }

    @Override
    public String toString() {
        return "EstEcrit{Auteur=" + auteur.getNom() + ", Livre=" + livre.getTitre() + ", Date_edition=" + date_edition + "}";
    }

}
