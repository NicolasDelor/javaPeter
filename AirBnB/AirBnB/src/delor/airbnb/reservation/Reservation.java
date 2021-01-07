package delor.airbnb.reservation;

import delor.airbnb.outils.Utile;
import delor.airbnb.utilisateurs.Personne;
import delor.airbnb.utilisateurs.Voyageur;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {

    private int identifiant;
    private Sejour sejour;
    private Voyageur voyageur;
    private boolean estValidee;
    private Date dateDeReservation;

    public Reservation(int identifiant, Sejour sejour, Voyageur voyageur) {
        this.identifiant = identifiant;
        this.sejour = sejour;
        this.voyageur = voyageur;
        estValidee = false;
        dateDeReservation = new Date();
    }

    public void afficher() {
        voyageur.afficher();
        System.out.print(" qui a fait une réservation chez ");
        sejour.afficher();
    }
}
