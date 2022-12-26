package fr.epsi.marave.character;

import fr.epsi.marave.utils.RandomUtil;

import java.util.List;

public class Mob extends Character {
    private static final List<String> names = List.of("Vampire", "Dragon d'Airain", "Guenièvre", "Gobelin", "la poule qui mue", "Pascal, non pas la patisserie traditionnelle d'Alsace, pas le grand frère non plus, évidemment, ce n'est pas le language de programmation, ni Pascal Obispo, ni Pascal Blaise, mais le sous marin français lancé en 1928.");
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
        int random = RandomUtil.randomInt(0, names.size());
        return names.get(random);
    }
}
