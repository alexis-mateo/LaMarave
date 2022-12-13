package fr.epsi.marave.character;

public class Joueur extends Personnage {

    private int level = 0;

    public Joueur(int strength, int maxHealth, int armor, int health) {
        super(strength, maxHealth, armor, health);
    }

    @Override
    public void attack(Personnage enemy) {

    }
}
