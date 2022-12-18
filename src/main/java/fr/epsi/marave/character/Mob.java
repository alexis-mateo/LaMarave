package fr.epsi.marave.character;

public class Mob extends Character {

    private static final int BASE_MOB_ARMOR = 12;
    private static final int BASE_MOB_STRENGTH = 12;
    private static final int BASE_MOB_HEALTH = 25;

    public Mob(int playerLevel) {
        super(
                BASE_MOB_STRENGTH + playerLevel * 2,
                BASE_MOB_ARMOR + playerLevel * 2,
                BASE_MOB_HEALTH + 2 * playerLevel
        );
    }

}
