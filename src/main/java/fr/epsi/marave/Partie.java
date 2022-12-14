package fr.epsi.marave;

import fr.epsi.marave.character.Joueur;

import java.util.Scanner;

public class Partie {
    private static final int MAX_TURNS = 20;
    private static final int MAX_STAT_POINTS = 12;
    private static final int DEFAULT_STRENGTH = 15;
    private static final int DEFAULT_ARMOR = 15;
    private static final int DEFAULT_HEALTH = 30;

    private int currentTurn = 1;
    Joueur joueur;


    public Partie() {
        this.joueur = new Joueur(
                DEFAULT_STRENGTH,
                DEFAULT_ARMOR,
                DEFAULT_HEALTH
        );

        joueur.addAdditionalStats(MAX_STAT_POINTS);
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        while (currentTurn <= MAX_TURNS && this.joueur.getCaracteristique().getHealth() > 0) {
            Tour turn = new Tour(this.joueur);
            System.out.println("Tour " + (currentTurn) + "/" + MAX_TURNS);
            turn.start();

            scan.nextLine();
            currentTurn++;
        }
    }
}
