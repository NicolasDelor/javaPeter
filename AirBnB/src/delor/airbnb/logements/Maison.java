package delor.airbnb.logements;

import delor.airbnb.utilisateurs.Hote;

public class Maison extends Logement {

    private static int superficieJardin;
    private static boolean poessedePiscine;

    public Maison(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin, boolean poessedePiscine) {
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieJardin = superficieJardin;
        this.poessedePiscine = poessedePiscine;
    }

    // @Override
    public static void afficher() {
        System.out.println("Le logement est une maison située "+Logement.getAdresse());
        Logement.afficher();

        System.out.print("Jardin : ");
        if (superficieJardin > 0) {
            System.out.println("Oui ("+superficieJardin+")");
        } else {
            System.out.println("Non");
        }
        System.out.print("Piscine : ");
        if (poessedePiscine == true) {
            System.out.print("Oui");
        } else {
            System.out.print("Non");
        }

    }
}
