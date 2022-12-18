package fr.epsi.marave.events;

import fr.epsi.marave.character.Player;

public interface Event {
    void launch(Player player);
}
