package fr.epsi.marave.events;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.utils.OutputMessageUtils;

public class RencontreMaitreDArme implements Event {
    @Override
    public void launch(Player player) {
        OutputMessageUtils.rencontreAvecMaitreDArme(player.getDisplayName());
        player.levelUp();
    }
}
