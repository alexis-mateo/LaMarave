package fr.epsi.marave.events;

import fr.epsi.marave.character.Player;

public class RencontreMerlin implements Event {

    @Override
    public void launch(Player player) {
        System.out.println("Rencontre avec merlin !");
        player.getCaracteristique().setHealth(player.getCaracteristique().getMaxHealth());
    }
}
