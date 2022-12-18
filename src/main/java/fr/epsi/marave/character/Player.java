package fr.epsi.marave.character;

import fr.epsi.marave.levelup.PlayerLevelUp;
import fr.epsi.marave.levelup.LevelUpManager;
import fr.epsi.marave.utils.ReadInput;

public class Player extends Character {

    private int level = 0;
    private final LevelUpManager lvlUpManager = new PlayerLevelUp();

    public Player(int strength, int armor, int health) {
        super(strength, armor, health);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addAdditionalStats(int maxStatPoints) {
        int total;

        do {
            System.out.println("Vous avez " + maxStatPoints + " à répartir: ");

            int armor = ReadInput.readInt("armor : ");
            this.getCaracteristique().setArmor(this.getCaracteristique().getArmor() + armor);

            int strength = ReadInput.readInt("strength : ");
            this.getCaracteristique().setStrength(this.getCaracteristique().getStrength() + strength);

            int health = ReadInput.readInt("health : ");
            this.getCaracteristique().setMaxHealth(this.getCaracteristique().getMaxHealth() + health);

            total = armor + strength + health;

            if(total > maxStatPoints) {
                System.out.println("Trop de point attribués\n");
            }
        } while (total > maxStatPoints);

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
