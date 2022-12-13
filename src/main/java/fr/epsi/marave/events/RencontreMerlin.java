package fr.epsi.marave.events;

import fr.epsi.marave.character.Joueur;

public class RencontreMerlin implements Event {

    @Override
    public void launch(Joueur joueur) {
        System.out.println("Rencontre avec merlin !");
        joueur.getCaracteristique().setHealth(joueur.getCaracteristique().getMaxHealth());
    }
}
