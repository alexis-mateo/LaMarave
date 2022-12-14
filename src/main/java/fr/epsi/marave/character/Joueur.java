package fr.epsi.marave.character;

import fr.epsi.marave.levelup.JoueurLevelUp;
import fr.epsi.marave.levelup.LevelUpManager;
import fr.epsi.marave.utils.ReadInput;

public class Joueur extends Personnage {

    private int level = 0;
    private final LevelUpManager lvlUpManager = new JoueurLevelUp();

    public Joueur(int strength, int armor, int health) {
        super(strength, armor, health);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addAdditionalStats(int maxStatPoints) {
        int armor = ReadInput.readInt("armor : ");
        this.getCaracteristique().setArmor(this.getCaracteristique().getArmor() + armor);

        int strength = ReadInput.readInt("strength : ");
        this.getCaracteristique().setStrength(this.getCaracteristique().getStrength() + strength);

        int health = ReadInput.readInt("health : ");
        this.getCaracteristique().setMaxHealth(this.getCaracteristique().getMaxHealth() + health);

        if(armor + strength + health > maxStatPoints) {
            System.out.println("Trop de point attribué");
        }
    }

    public void levelUp() {
        lvlUpManager.levelUp(this);
    }

    public void healBasedOnCurrentHealth(int healPercentage){
        // Restaure des pvs, équivalent à (pourcentageDusoin)% des PV ... Restant
        int pointsDeVieActuel = this.getCaracteristique().getHealth();
        int hauteurDuSoin = (int)Math.round(this.getCaracteristique().getHealth() * ((double)healPercentage / 100));
        this.getCaracteristique().setHealth(pointsDeVieActuel + hauteurDuSoin);
    }
}
