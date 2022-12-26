package fr.epsi.marave;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.events.Event;
import fr.epsi.marave.events.EventFactory;
import fr.epsi.marave.utils.OutputMessageUtils;

public class Turn {
    private final Event event;

    public Turn() {
        this.event = EventFactory.buildEvent();
    }

    public void start(Player player) {
        OutputMessageUtils.displayCharacterStats(player);
        event.launch(player);
    }
}
