package fr.epsi.marave.events;

import fr.epsi.marave.character.Joueur;
import fr.epsi.marave.character.Mob;
import fr.epsi.marave.character.Personnage;
import fr.epsi.marave.utils.RandomUtil;

public class Combat implements Event {
    boolean isPlayerAttack;

    public Combat() {
        int proba = RandomUtil.randomInt(0, 100);

        this.isPlayerAttack = (proba <= 65);
    }

    @Override
    public void launch(Joueur joueur) {
        Personnage mob = new Mob(joueur.getLevel());
        System.out.println("Stats du mob");
        System.out.println(mob.getCaracteristique());
        System.out.println((isPlayerAttack ? "Joueur" : "Mob") + " commence");

        while (mob.getCaracteristique().getHealth() > 0 && joueur.getCaracteristique().getHealth() > 0) {
            if(isPlayerAttack) {
                joueur.attack(mob);
                isPlayerAttack = false;
            } else {
                mob.attack(joueur);
                isPlayerAttack = true;
            }
        }
    }
}
