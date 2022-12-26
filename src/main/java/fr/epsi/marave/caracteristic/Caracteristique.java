package fr.epsi.marave.caracteristic;

public class Caracteristique {
    private int strength;
    private int maxHealth;
    private int armor;
    private int health;

    public Caracteristique(int strength, int maxHealth, int armor, int health) {
        this.strength = strength;
        this.maxHealth = maxHealth;
        this.armor = armor;
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.min(health, this.maxHealth);
    }
}
