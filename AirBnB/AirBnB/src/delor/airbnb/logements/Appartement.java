package delor.airbnb.logements;

import delor.airbnb.utilisateurs.Hote;
import delor.airbnb.utilisateurs.Personne;

public class Appartement extends Logement {
    private int superficieBalcon;
    private int numeroEtage;

    public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieBalcon, int numeroEtage) {
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieBalcon = superficieBalcon;
        this.numeroEtage = numeroEtage;
    }

    public void afficher() {

        // hote.afficher();
        System.out.println("Superficie : " + getSuperficie()); // Logement
        System.out.print("Ce logement est un appartement situé " + getAdresse() + " au ");
        if (numeroEtage == 0) {
            System.out.println("Rez-de-chaussée");
        } else if (numeroEtage == 1) {
            System.out.println("Au 1er étage");
        } else {
            System.out.println("Au " + numeroEtage + "ème étage");
        }
        System.out.print("Balcon : ");
        if (superficieBalcon <= 0) {
            System.out.println("Non");
        } else {
            System.out.println("Oui (" + superficieBalcon + ")");
        }

    }
}
