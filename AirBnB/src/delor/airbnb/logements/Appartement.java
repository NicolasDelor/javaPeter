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



    public static void afficher() {

        System.out.println("Le logement est un appartement situé "+Logement.getAdresse());
        Logement.afficher();

    }

}
