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
public class Exemplaire {

    private static int code = 1;
    private int codeExemplaire;
    private Livre livre = null;
    private boolean estEmprunter = false;
    private Emprunt emprunt = null;

	private Exemplaire() {
	}

    public Exemplaire(Livre livre) {
        this.codeExemplaire = code++;
        this.livre = livre;
        this.livre.addExemplaire(this);
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

    @Override
    public String toString() {
        return "Exemplaire{codeExemplaire=" + codeExemplaire + ", Livre=" + livre.getTitre() + "}";
    }

    /**
     * @return the codeExemplaire
     */
    public int getCodeExemplaire() {
        return codeExemplaire;
    }

    /**
     * @param codeExemplaire the codeExemplaire to set
     */
    public void setCodeExemplaire(int codeExemplaire) {
        this.codeExemplaire = codeExemplaire;
    }

    /**
     * @return the estEmprunter
     */
    public boolean isEstEmprunter() {
        return estEmprunter;
    }

    /**
     * @param estEmprunter the estEmprunter to set
     */
    public void setEstEmprunter(boolean estEmprunter) {
        this.estEmprunter = estEmprunter;
    }

    /**
     * @return the emprunt
     */
    public Emprunt getEmprunt() {
        return emprunt;
    }

    /**
     * @param emprunt the emprunt to set
     */
    public void setEmprunt(Emprunt emprunt) {
        this.emprunt = emprunt;
    }
    
    
}
