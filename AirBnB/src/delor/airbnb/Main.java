package delor.airbnb;

import java.text.ParseException;
import java.util.Date;

import delor.airbnb.logements.Appartement;
import delor.airbnb.logements.Logement;
import delor.airbnb.logements.Maison;
import delor.airbnb.outils.Utile;
import delor.airbnb.reservation.Reservation;
import delor.airbnb.reservation.Sejour;
import delor.airbnb.utilisateurs.Hote;
import delor.airbnb.utilisateurs.Personne;
import delor.airbnb.utilisateurs.Voyageur;

public class Main {

    public static void main(String[] args) throws ParseException {

        // ----------------------------------------------------
        // Données - Personnes et Logements
        Hote hote1 = new Hote("Peter", "Bardu", 31, 2);
        Hote hote2 = new Hote("Nicolas", "Delor", 26, 1);
        Hote hote3 = new Hote("Adelin", "Rol", 26, 4);

        // Voyageur voyageur1 = new Voyageur("Peter", "Bardu", 31);
        // Voyageur voyageur2 = new Voyageur("Michel", "Jordan", 34);
        Voyageur voyageur3 = new Voyageur("Jean", "Mi", 24);

        Personne personne1 = new Personne("Peter", "Bardu", 31);
        Personne personne2 = new Personne("Michel", "Jordan", 34);
        Personne personne3 = new Personne("Jean", "Mi", 24);
        Personne personne4 = new Personne("Emma", "Martin", 31);

        Maison maison1 = new Maison(hote1, 100, "81 rue Colbert", 60, 4, 1000, true);
        Maison maison2 = new Maison(hote2, 70, "30 bis rue devildé", 50, 1, 100, false);
        Appartement appartement1 = new Appartement(hote2, 100, "81 rue Colbert", 60, 4, 1000, 1);
        Appartement appartement2 = new Appartement(hote1, 70, "30 bis rue devildé", 50, 1, 100, 4);

        // ----------------------------------------------------
        // Critère de séjour
        Date dateArrivee = Utile.stringToDate("01/07/2020");
        int nbNuits = 2;
        int nbVoyageurs = 2;
        Logement logement1 = maison1;

        Sejour sejour = new Sejour(dateArrivee, nbNuits, maison1, nbVoyageurs);

        Reservation reservation = new Reservation(0, sejour, voyageur3);
        sejour.afficher();
    }
}
