package fr.epsi.marave.events;

import fr.epsi.marave.utils.RandomUtil;

public class EventFactory {

    public static Event buildEvent() {
        int proba = RandomUtil.randomInt(1, 100);
        if(proba <= 50) {
            return new Combat();
        } else if (proba <= 75) {
            return new RencontreMaitreDArme();
        } else {
            return new RencontreMerlin();
        }
    }
}
