package fr.epsi.marave;

import fr.epsi.marave.character.Player;

import java.util.Scanner;

public class Partie {
    private static final int MAX_TURNS = 20;
    private static final int MAX_STAT_POINTS = 12;
    private static final int DEFAULT_STRENGTH = 15;
    private static final int DEFAULT_ARMOR = 15;
    private static final int DEFAULT_HEALTH = 30;

    private int currentTurn = 1;
    Player player;


    public Partie() {
        this.player = new Player(
                DEFAULT_STRENGTH,
                DEFAULT_ARMOR,
                DEFAULT_HEALTH
        );

        player.addAdditionalStats(MAX_STAT_POINTS);
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        while (currentTurn <= MAX_TURNS && this.player.getCaracteristique().getHealth() > 0) {
            Turn turn = new Turn(this.player);
            System.out.println("Tour " + (currentTurn) + "/" + MAX_TURNS);
            turn.start();

            System.out.println("\nAppuyez sur une touche pour continuer...");
            scan.nextLine();
            System.out.println();
            currentTurn++;
        }
    }
}
