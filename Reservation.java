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
public class Reservation {

    private Livre livre = null;
    private Etudiant etudiant = null;
    private Date dateReservation = null;

    public Reservation() {
    }

    public Reservation(Livre livre, Etudiant etudiant, Date dateReservation) {
        this.livre = livre;
        this.etudiant = etudiant;
        this.dateReservation = dateReservation;
        this.etudiant.addReservation(this);
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
     * @return the etudiant
     */
    public Etudiant getEtudiant() {
        return etudiant;
    }

    /**
     * @param etudiant the etudiant to set
     */
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Exemplaire{Etudiant=" + etudiant + ", Livre=" + livre + ", DateReservation=" + dateReservation + "}";
    }

    /**
     * @return the dateReservation
     */
    public Date getDateReservation() {
        return dateReservation;
    }

    /**
     * @param dateReservation the dateReservation to set
     */
    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

}
