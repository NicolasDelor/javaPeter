package delor.airbnb.logements;

import delor.airbnb.utilisateurs.Hote;
import delor.airbnb.utilisateurs.Personne;

public abstract class Logement {

    private static Hote hote;
    private static int tarifParNuit;
    private static String adresse;
    private static int superficie;
    private static int nbVoyageursMax;

    public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public static String getAdresse() {
        return adresse;
    }

    public static void afficher() {

        System.out.println("Le logement est une .AEFLD?VSF située "+adresse);
        System.out.println("Superficie : "+superficie);
    }


}
