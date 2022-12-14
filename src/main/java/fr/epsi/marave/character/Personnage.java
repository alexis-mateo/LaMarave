package fr.epsi.marave.character;

import fr.epsi.marave.caracteristic.Caracteristique;
import fr.epsi.marave.caracteristic.CaracteristiqueBuilder;
import fr.epsi.marave.utils.RandomUtil;

public abstract class Personnage {
    private final Caracteristique caracteristique;

    public Personnage(int strength, int armor, int health) {
        CaracteristiqueBuilder builder = new CaracteristiqueBuilder();
        builder.setArmor(armor).setHealth(health).setMaxHealth(health).setStrength(strength);
        this.caracteristique = builder.getResult();
    }

    public Caracteristique getCaracteristique() {
        return caracteristique;
    }

    public void attack(Personnage enemy) {
        int des12 = RandomUtil.randomInt(1, 12);
        int dgt = des12 + this.getCaracteristique().getStrength() - enemy.getCaracteristique().getArmor();
        if(dgt > 0) {
            int newEnemyHealth = enemy.getCaracteristique().getHealth() - dgt;
            enemy.getCaracteristique().setHealth(newEnemyHealth);
        }
        System.out.println("Resultat De12 : " + des12);
        System.out.println("Dgt Atq : " + dgt);
    }
}

