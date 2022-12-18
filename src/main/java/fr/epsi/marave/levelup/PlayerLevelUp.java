package fr.epsi.marave.levelup;

import fr.epsi.marave.character.Player;

public class PlayerLevelUp implements LevelUpManager{

    @Override
    public void levelUp(Player player) {
        player.setLevel(player.getLevel() + 1);
        player.addAdditionalStats(3);
        player.healBasedOnCurrentHealth(10);
    }
}
