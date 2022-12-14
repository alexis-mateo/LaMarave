package fr.epsi.marave.levelup;

import fr.epsi.marave.character.Joueur;

public class JoueurLevelUp implements LevelUpManager{

    @Override
    public void levelUp(Joueur joueur) {
        joueur.setLevel(joueur.getLevel() + 1);
        joueur.addAdditionalStats(3);
        joueur.healBasedOnCurrentHealth(10);
    }
}
