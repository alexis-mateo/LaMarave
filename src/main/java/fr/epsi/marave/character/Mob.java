package fr.epsi.marave.character;

import fr.epsi.marave.utils.RandomUtil;

public class Mob extends Character {

    private static final int BASE_MOB_ARMOR = 12;
    private static final int BASE_MOB_STRENGTH = 12;
    private static final int BASE_MOB_HEALTH = 25;

    public Mob(int playerLevel) {
        super(
                getNameOfMobs(),
                BASE_MOB_STRENGTH + playerLevel * 2,
                BASE_MOB_ARMOR + playerLevel * 2,
                BASE_MOB_HEALTH + 2 * playerLevel
        );
    }

    private static String getNameOfMobs(){
        int random = RandomUtil.randomInt(0,5);
        switch (random)
        {
            case 0:
                return "Vampire";
            case 1:
                return "Dragon d'Airain";
            case 2:
                return "Guenièvre";
            case 3:
                return "Gobelin";
            case 4:
                return "la poule qui mue";
            default:
                return "Pascal, pas la patisserie traditionnelle d'Alsace, pas le grand frère non plus, évidemment, ce n'est pas le language de programmation. Ni Pascal Obispo, ni Pascal Blaise, mais du sous marin français lancé en 1928.";
        }
    }
}
