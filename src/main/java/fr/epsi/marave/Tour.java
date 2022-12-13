package fr.epsi.marave;

import fr.epsi.marave.character.Joueur;
import fr.epsi.marave.events.Event;
import fr.epsi.marave.events.EventFactory;

public class Tour {
    private Event event;
    private Joueur joueur;

    public Tour(Joueur joueur) {
        this.joueur = joueur;
        this.event = EventFactory.buildEvent();
    }

    public void start() {
        event.launch(this.joueur);
    }
}
