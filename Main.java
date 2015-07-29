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
public class Main {
    public static void main(String []args) {
        Bib bib = new Bib();
        
        //Question a
        Auteur a0 = new Auteur(1140, "auth0", "auth0", "adresse auth0", "auth0@auth.tn");
        Auteur a1 = new Auteur(1141, "auth1", "auth1", "adresse auth1", "auth1@auth.tn");
        Auteur a2 = new Auteur(1142, "auth2", "auth2", "adresse auth2", "auth2@auth.tn");
        bib.addAuteur(a0);
        bib.addAuteur(a1);
        bib.addAuteur(a2);
        
        //Question b
        Livre l0 = new Livre(1, "MyJAVA", new Date(100,5,7), "ERA", "aaa");
        Livre l1 = new Livre(2, "MyPHP", new Date(101,8,27), "ERA", "bbb");
        Livre l2 = new Livre(3, "MyC++", new Date(103,4,12), "ERA", "ccc");
        bib.addLivre(l0);
        bib.addLivre(l1);
        bib.addLivre(l2);
        
        //genere les relations est_ecrit
        bib.addEstEcrit(l0, a0, new Date(100,4,12)/* 12-05-2000 */);
        bib.addEstEcrit(l0, a1, new Date(100,4,12));
        bib.addEstEcrit(l1, a2, new Date(101,7,22));
        bib.addEstEcrit(l2, a1, new Date(101,3,17));
        bib.addEstEcrit(l2, a2, new Date(100,3,17));
        
        //Question c
        bib.addExemplaire(l0, 1);
        bib.addExemplaire(l1, 3);
        bib.addExemplaire(l2, 5);
       
        //Question d
        Etudiant e0 = new Etudiant(1020, "aaa", "aaa", "adresse aaa", "aaa@etudiant.tn", 8020,new Date(113, 10, 15)/* 15-11-2013 */);
        Etudiant e1 = new Etudiant(1021, "bbb", "bbb", "adresse bbb", "bbb@etudiant.tn", 8125,new Date(114, 5, 20));
        Etudiant e2 = new Etudiant(1022, "ccc", "ccc", "adresse aaa", "ccc@etudiant.tn", 8279,new Date(114, 6, 6));
        bib.addEtudiant(e0);
        bib.addEtudiant(e1);
        bib.addEtudiant(e2);
        
        //Qestion e
        //fait un emprunt
        bib.EmprunterExemplaire(1, e0, new Date(113,11,22)/* 22-12-2013 */, new Date(114,0,4)/* 04-01-2014 */);//l'emprunt n'est pas fait car la validite de la carte est expirer
        bib.EmprunterExemplaire(1, e1, new Date(113,11,20), new Date(114,0,28));//un emprunt valide
        
        //Qestion f
        bib.EmprunterExemplaire(1, e2, new Date(113,11,24), new Date(114,0,10));//l'emprunt n'est pas fait car il n'y a pas d'exemplaire disponible
        bib.Reserver(l0, e2, new Date(114,0,10));//l'etudiant fiat une reservation
        
        //Afficher le contenue de la bibliotheque
        System.out.println(bib);
        
        //Qestion g
        bib.ListeLivres();
    }
}
