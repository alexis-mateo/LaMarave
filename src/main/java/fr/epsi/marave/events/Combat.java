package fr.epsi.marave.events;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.character.Mob;
import fr.epsi.marave.character.Character;
import fr.epsi.marave.utils.OutputMessageUtils;
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
        OutputMessageUtils.debutDeCombat(mob, isPlayerAttack);

        while (mob.getCaracteristique().getHealth() > 0 && player.getCaracteristique().getHealth() > 0) {
            if(isPlayerAttack) {
                player.attack(mob);
                isPlayerAttack = false;
            } else {
                mob.attack(player);
                isPlayerAttack = true;
            }
        }
    }
}
