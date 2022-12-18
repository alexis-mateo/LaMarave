package fr.epsi.marave.events;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.character.Mob;
import fr.epsi.marave.character.Character;
import fr.epsi.marave.utils.RandomUtil;

public class Combat implements Event {
    boolean isPlayerAttack;

    public Combat() {
        int proba = RandomUtil.randomInt(0, 100);

        this.isPlayerAttack = (proba <= 65);
    }

    @Override
    public void launch(Player player) {
        Character mob = new Mob(player.getLevel());
        System.out.println("Stats du mob");
        System.out.println(mob.getCaracteristique());
        System.out.println((isPlayerAttack ? "Joueur" : "Mob") + " commence");

        while (mob.getCaracteristique().getHealth() > 0 && player.getCaracteristique().getHealth() > 0) {
            if(isPlayerAttack) {
                System.out.println("Au tour du joueur");
                player.attack(mob);
                isPlayerAttack = false;
            } else {
                System.out.println("Au tour du mob");
                mob.attack(player);
                isPlayerAttack = true;
            }
        }
    }
}
