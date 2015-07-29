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
public class Emprunt {

    private Exemplaire exemplaire = null;
    private Etudiant etudiant = null;
    private Date dateEmprunt = null;
    private Date dateRetour = null;

    public Emprunt() {
    }

    public Emprunt(Exemplaire exemplaire, Etudiant etudiant, Date dateEmprunt, Date dateRetour) {
        this.exemplaire = exemplaire;
        this.etudiant = etudiant;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.exemplaire.setEmprunt(this);
        this.exemplaire.setEstEmprunter(true);
    }

    @Override
    public String toString() {
        return "Emprunt{Exemplaire=" + exemplaire + ", Etudiant=" + etudiant + ", DateEmprunt=" + dateEmprunt + ", DateRetour=" + dateRetour + "}"; //To change body of generated methods, choose Tools | Templates.
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

}
