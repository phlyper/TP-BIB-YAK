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
public class Etudiant extends Personne {

    private int numero;
    private Date validation_carte = null;
    private int nombre_emprunt = 0;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public Etudiant() {
    }

    public Etudiant(int cin, String nom, String prenom, String adresse_postal, String email, int numero, Date validation_carte) {
        super(cin, nom, prenom, adresse_postal, email);
        this.numero = numero;
        this.validation_carte = validation_carte;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the validation_carte
     */
    public Date getValidation_carte() {
        return validation_carte;
    }

    /**
     * @param validation_carte the validation_carte to set
     */
    public void setValidation_carte(Date validation_carte) {
        this.validation_carte = validation_carte;
    }

    /**
     * @return the nombre_emprunt
     */
    public int getNombre_emprunt() {
        return nombre_emprunt;
    }

    /**
     * @param nombre_emprunt the nombre_emprunt to set
     */
    public void setNombre_emprunt(int nombre_emprunt) {
        this.nombre_emprunt = nombre_emprunt;
    }

    @Override
    public String toString() {
        return "Etudiant{" + super.toString() + ", Numero=" + numero + ", Nombre_emprunt=" + nombre_emprunt + ", Date_validation=" + validation_carte + "}";
    }

    public void addReservation(Reservation r){
        reservations.add(r);
    }

    /**
     * @return the reservations
     */
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

}
