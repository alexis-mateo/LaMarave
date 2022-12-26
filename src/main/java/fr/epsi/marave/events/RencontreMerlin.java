package fr.epsi.marave.events;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.utils.OutputMessageUtils;

public class RencontreMerlin implements Event {

    @Override
    public void launch(Player player) {
        OutputMessageUtils.rencontreAvecMerlin(player.getDisplayName());
        player.getCaracteristique().setHealth(player.getCaracteristique().getMaxHealth());
    }
}
