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
public class Bib {

    public final static int seul_emprunt = 5;  // nbre maximal d'emprunte par un etudiant 
    public final static int seul_reservation = 5;  // nbre maximal de reservation de different livres par un etudiant
    private ArrayList<Auteur> auteurs = new ArrayList<Auteur>();
    private ArrayList<Livre> livres = new ArrayList<Livre>();
    private ArrayList<Est_ecrit> ecrits = new ArrayList<Est_ecrit>();
    private ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    private ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    private ArrayList<Emprunt> emprunts = new ArrayList<Emprunt>();

    public ArrayList<Emprunt> findEmpruntEtudiant(Etudiant e) {
        ArrayList<Emprunt> emprunts = new ArrayList<Emprunt>();
        for (Emprunt em : this.emprunts) {
            if (em.getEtudiant().equals(e)) {
                emprunts.add(em);
            }
        }
        return emprunts;
    }

    public Exemplaire findExemplaire(int codeExemplaire) {
        for (Exemplaire e : this.exemplaires) {
            if (e.getCodeExemplaire() == codeExemplaire) {
                if (e.isEstEmprunter() == false) {
                    return e;
                }
            }
        }
        return null;
    }

    public boolean EmprunterExemplaire(int codeExemplaire, Etudiant etudiant, Date DateEmprunt, Date DateRetour) {
        if (etudiant.getValidation_carte().after(DateEmprunt)) {
            if (findEmpruntEtudiant(etudiant).size() < seul_emprunt) {
                Exemplaire e = findExemplaire(codeExemplaire);
                if (e != null) {
                    this.emprunts.add(new Emprunt(e, etudiant, DateEmprunt, DateRetour));
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Reserver(Livre livre, Etudiant etudiant, Date DateReservation) {
        if (etudiant.getValidation_carte().after(DateReservation)) {
            this.reservations.add(new Reservation(livre, etudiant, DateReservation));
            return true;
        }
        return false;
    }
    
    public void ListeLivres() {
        String s="\nListe des livres (empruntées et non empruntées)\n";
        int nbEmp , nbNonEmp;
        for(Livre l:livres) {
            s+=l.toString()+"\n";
            nbEmp = nbNonEmp = 0;
            for(Exemplaire e:l.getExemplaires()) {
                if(e.isEstEmprunter()) {
                    s+="\t"+e.getEmprunt().getEtudiant()+"\n";
                    nbEmp++;
                } else {
                    nbNonEmp++;
                }
            }
            s+="Le nombre total des exemplaires empruntées :"+nbEmp+"\n";
            s+="Le nombre total des exemplaires disponibles :"+nbNonEmp+"\n";
            s+="\n";
        }
        System.out.println(s);
    }

    public void addLivre(Livre livre) {
        livres.add(livre);
    }

    public void addAuteur(Auteur auteur) {
        auteurs.add(auteur);
    }

    public void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void addExemplaire(Livre livre, int nbExemplaire) {
        for (int i = 0; i < nbExemplaire; i++) {
            exemplaires.add(new Exemplaire(livre));
        }
    }

    public void addEstEcrit(Livre livre, Auteur auteur, Date dateEdition) {
        ecrits.add(new Est_ecrit(livre, auteur, dateEdition));
    }

    @Override
    public String toString() {
        String s = "";

        s += "Liste des etudiants: " + etudiants.size() + "\n";
        for (Etudiant e : etudiants) {
            s += e.toString() + "\n";
        }

        s += "\nListe des auteurs: " + auteurs.size() + "\n";
        for (Auteur a : auteurs) {
            s += a.toString() + "\n";
        }

        s += "\nListe des livres: " + livres.size() + "\n";
        for (Livre l : livres) {
            s += l.toString() + "\n";
        }

        s += "\nListe des exemplaires: " + exemplaires.size() + "\n";
        for (Exemplaire e : exemplaires) {
            s += e.toString() + "\n";
        }

        s += "\nListe des emprunts: " + emprunts.size() + "\n";
        for (Emprunt e : emprunts) {
            s += e.toString() + "\n";
        }

        s += "\nListe des reservations: " + reservations.size() + "\n";
        for (Reservation r : reservations) {
            s += r.toString() + "\n";
        }

        return s;
    }

}
