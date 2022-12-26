package fr.epsi.marave.character;

import fr.epsi.marave.caracteristic.Caracteristique;
import fr.epsi.marave.caracteristic.CaracteristiqueBuilder;
import fr.epsi.marave.utils.OutputMessageUtils;
import fr.epsi.marave.utils.RandomUtil;

public abstract class Character {
    private final String displayName;
    private final Caracteristique caracteristique;

    public Character(String name, int strength, int armor, int health) {
        this.displayName = name;
        CaracteristiqueBuilder builder = new CaracteristiqueBuilder();
        builder.setArmor(armor).setHealth(health).setMaxHealth(health).setStrength(strength);
        this.caracteristique = builder.getResult();
    }

    public String getDisplayName() {
        return displayName;
    }

    public Caracteristique getCaracteristique() {
        return caracteristique;
    }

    public void attack(Character target) {
        int d12 = RandomUtil.randomInt(1, 12);
        int damage = d12 + this.getCaracteristique().getStrength() - target.getCaracteristique().getArmor();
        if (damage > 0) {
            int newEnemyHealth = target.getCaracteristique().getHealth() - damage;
            target.getCaracteristique().setHealth(newEnemyHealth);
        }
        OutputMessageUtils.attack(target, d12, damage);
    }
}

