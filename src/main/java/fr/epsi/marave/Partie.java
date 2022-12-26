package fr.epsi.marave;

import fr.epsi.marave.character.Player;
import fr.epsi.marave.utils.OutputMessageUtils;
import fr.epsi.marave.utils.ReadInput;

public class Partie {
    private static final int MAX_TURNS = 20;
    private static final int MAX_STAT_POINTS = 12;
    private static final int DEFAULT_STRENGTH = 15;
    private static final int DEFAULT_ARMOR = 15;
    private static final int DEFAULT_HEALTH = 30;

    private int currentTurn = 1;
    Player player;


    public Partie() {
        OutputMessageUtils.debutDePartie();
        String name = ReadInput.readLine();

        this.player = new Player(
                name,
                DEFAULT_STRENGTH,
                DEFAULT_ARMOR,
                DEFAULT_HEALTH
        );

        player.addAdditionalStats(MAX_STAT_POINTS);
    }

    public void start() {
        while (currentTurn <= MAX_TURNS && this.player.getCaracteristique().getHealth() > 0) {
            Turn turn = new Turn();
            OutputMessageUtils.numberOfTurn(currentTurn, MAX_TURNS);
            turn.start(this.player);

            OutputMessageUtils.pressKeyToContinue();
            currentTurn++;
        }

        if (currentTurn > MAX_TURNS){
            OutputMessageUtils.victory();
        } else {
            OutputMessageUtils.defeat();
        }
    }
}
