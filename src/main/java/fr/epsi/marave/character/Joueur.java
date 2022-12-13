package fr.epsi.marave.character;

import fr.epsi.marave.utils.RandomUtil;

public class Joueur extends Personnage {

    private int level = 0;

    public Joueur(int strength, int armor, int health) {
        super(strength, armor, health);
    }

    public int getLevel() {
        return level;
    }
}
