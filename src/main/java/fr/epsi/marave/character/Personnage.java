package fr.epsi.marave.character;

import fr.epsi.marave.caracteristic.Caracteristique;
import fr.epsi.marave.caracteristic.CaracteristiqueBuilder;

public abstract class Personnage {
    private final Caracteristique caracteristique;

    public Personnage(int strength, int maxHealth, int armor, int health) {
        CaracteristiqueBuilder builder = new CaracteristiqueBuilder();
        builder.setArmor(armor).setHealth(health).setMaxHealth(maxHealth).setStrength(strength);
        this.caracteristique = builder.getResult();
    }

    public Caracteristique getCaracteristique() {
        return caracteristique;
    }

    public abstract void attack(Personnage enemy);
}

