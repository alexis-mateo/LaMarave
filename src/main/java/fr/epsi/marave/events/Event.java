package fr.epsi.marave.events;

import fr.epsi.marave.character.Joueur;

public interface Event {
    void launch(Joueur joueur);
}
