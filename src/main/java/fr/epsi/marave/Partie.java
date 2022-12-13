package fr.epsi.marave;

import fr.epsi.marave.character.Joueur;
import fr.epsi.marave.utils.ReadInput;

import java.util.ArrayList;

public class Partie {
    private static final int MAX_TURNS = 20;
    private static final int MAX_STAT_POINTS = 12;
    private static final int DEFAULT_STRENGTH = 15;
    private static final int DEFAULT_ARMOR = 15;
    private static final int DEFAULT_HEALTH = 30;

    private ArrayList<Tour> turns = new ArrayList<>();
    private int currentTurn = 0;
    Joueur joueur;


    public Partie() {
        int armor = ReadInput.readInt("armor : ");
        int strength = ReadInput.readInt("strength : ");
        int health = ReadInput.readInt("health : ");

        if(armor + strength + health > MAX_STAT_POINTS) {
            System.out.println("Trop de point attribué");
            return;
        }

        this.joueur = new Joueur(
                DEFAULT_STRENGTH + strength,
                DEFAULT_HEALTH + health,
                DEFAULT_ARMOR + armor,
                DEFAULT_HEALTH + health
        );
    }

    public void start() {
        while (currentTurn < MAX_TURNS && this.joueur.getCaracteristique().getHealth() > 0) {
            Tour turn = new Tour(this.joueur);
            turn.start();
            turns.add(turn);

            currentTurn++;
        }
    }
}