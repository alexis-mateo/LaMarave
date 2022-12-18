package fr.epsi.marave;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.events.Event;
import fr.epsi.marave.events.EventFactory;

public class Turn {
    private final Event event;
    private final Player player;

    public Turn(Player player) {
        this.player = player;
        this.event = EventFactory.buildEvent();
    }

    public void start() {
        System.out.println("Votre level: " + player.getLevel());
        System.out.println("Vos stats");
        System.out.println(player.getCaracteristique() + "\n");
        event.launch(this.player);
    }
}
