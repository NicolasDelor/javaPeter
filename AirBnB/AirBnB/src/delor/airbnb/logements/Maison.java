package delor.airbnb.logements;

import delor.airbnb.utilisateurs.Hote;

public class Maison extends Logement {

    private int superficieJardin;
    private boolean poessedePiscine;

    public Maison(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin, boolean poessedePiscine) {
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieJardin = superficieJardin;
        this.poessedePiscine = poessedePiscine;
    }

    @Override
    public void afficher() {
        // hote.afficher();
        System.out.println("Superficie : " + getSuperficie()); // Logement
        System.out.println("Ce logement est une maison située " + getAdresse());

        System.out.print("Jardin : ");
        if (superficieJardin > 0) {
            System.out.println("Oui (" + superficieJardin + ")");
        } else {
            System.out.println("Non");
        }
        System.out.print("Piscine : ");
        if (poessedePiscine == true) {
            System.out.print("Oui ");
        } else {
            System.out.print("Non ");
        }
    }
}
