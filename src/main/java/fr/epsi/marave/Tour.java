package fr.epsi.marave;

import fr.epsi.marave.character.Joueur;
import fr.epsi.marave.events.Event;
import fr.epsi.marave.events.EventFactory;

public class Tour {
    private final Event event;
    private final Joueur joueur;

    public Tour(Joueur joueur) {
        this.joueur = joueur;
        this.event = EventFactory.buildEvent();
    }

    public void start() {
        System.out.println("Vos stats");
        System.out.println(joueur.getCaracteristique());
        event.launch(this.joueur);
    }
}
