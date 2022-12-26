package fr.epsi.marave.character;

import fr.epsi.marave.levelup.PlayerLevelUp;
import fr.epsi.marave.levelup.LevelUpManager;
import fr.epsi.marave.utils.OutputMessageUtils;
import fr.epsi.marave.utils.ReadInput;

public class Player extends Character {

    private int level = 0;
    private final LevelUpManager lvlUpManager = new PlayerLevelUp();

    public Player(String name, int strength, int armor, int health) {
        super(name, strength, armor, health);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addAdditionalStats(int maxStatPoints) {
        int pointsAwarded;

        do {
            OutputMessageUtils.addAdditionalStats(maxStatPoints);

            int armor = ReadInput.readInt("armor : ");
            this.getCaracteristique().setArmor(this.getCaracteristique().getArmor() + armor);

            int strength = ReadInput.readInt("strength : ");
            this.getCaracteristique().setStrength(this.getCaracteristique().getStrength() + strength);

            int health = ReadInput.readInt("health : ");
            this.getCaracteristique().setMaxHealth(this.getCaracteristique().getMaxHealth() + health);

            pointsAwarded = armor + strength + health;

            if(pointsAwarded != maxStatPoints) {
                OutputMessageUtils.addAdditionalStatsError(pointsAwarded, maxStatPoints);
            }
        } while (pointsAwarded != maxStatPoints);
        System.out.println();
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
