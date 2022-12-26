package fr.epsi.marave;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.events.Event;
import fr.epsi.marave.events.EventFactory;
import fr.epsi.marave.utils.OutputMessageUtils;

public class Turn {
    private final Event event;
    private final Player player;

    public Turn(Player player) {
        this.player = player;
        this.event = EventFactory.buildEvent();
    }

    public void start() {
        OutputMessageUtils.displayCharacterStats(player);
        event.launch(this.player);
    }
}
