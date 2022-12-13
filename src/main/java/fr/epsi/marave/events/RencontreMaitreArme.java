package fr.epsi.marave.events;

import fr.epsi.marave.character.Joueur;

public class RencontreMaitreArme implements Event {
    @Override
    public void launch(Joueur joueur) {
        System.out.println("Rencontre avec le maitre");
    }
}
