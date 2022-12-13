package fr.epsi.marave.caracteristic;

public class CaracteristiqueBuilder implements Builder {
    private int strength;
    private int maxHealth;
    private int armor;
    private int health;

    @Override
    public CaracteristiqueBuilder setArmor(int armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public CaracteristiqueBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public CaracteristiqueBuilder setStrength(int strength) {
        this.strength = strength;
        return this;
    }

    @Override
    public CaracteristiqueBuilder setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        return this;
    }

    public Caracteristique getResult() {
        return new Caracteristique(strength, maxHealth, armor, health);
    }
}
