package delor.airbnb.logements;

import delor.airbnb.utilisateurs.Hote;
import delor.airbnb.utilisateurs.Personne;

public abstract class Logement {

    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public Hote getHote() {
        return hote;
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getSuperficieTotal() {
        int SuperficieTotal = superficie + 1; // +/- qque chose
        return SuperficieTotal;
    }

    public void afficher() {
        hote.afficher();

        System.out.println("Superficie : " + superficie);

    }


}
