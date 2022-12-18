package fr.epsi.marave.events;

import fr.epsi.marave.character.Player;

public class RencontreMaitreArme implements Event {
    @Override
    public void launch(Player player) {
        System.out.println("Rencontre avec le maitre");
        player.levelUp();
    }
}
