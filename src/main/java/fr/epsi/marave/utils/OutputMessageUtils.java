package fr.epsi.marave.utils;

import fr.epsi.marave.character.Character;
import fr.epsi.marave.character.Player;

public class OutputMessageUtils {
    public static void debutDePartie() {
        System.out.print("Nouvelle Partie.\n" +
                "Veuillez saisir votre nom : ");
    }

    public static void debutDeCombat(Character character, boolean isPlayerAttack) {
        if(isPlayerAttack){
            System.out.println("Vous rencontrez un " + character.getDisplayName() + ".\n" +
                    "Vous avez l'initiative !");
        } else {
            System.out.println("Un " + character.getDisplayName() + " vous surprend !\n");
        }

        displayCharacterStats(character);
    }

    public static void attack(Character target, int d12, int damage) {
        System.out.println("On lance le dé 12. On obtient : " + d12 + "\n" +
                "Dégâts infligés : " + Math.max(damage, 0)  + "\n" +
                target.getDisplayName() + ", pv restants : " + target.getCaracteristique().getHealth());
        System.out.println();
    }

    public static void displayCharacterStats(Character character) {
        boolean isPlayer = character instanceof Player;
        if (isPlayer) {
            System.out.println("\nVoici vos stats : \n" +
                    "Level : " + ((Player) character).getLevel());
        } else {
            System.out.println("Voici les stats du " + character.getDisplayName() + " :");
        }
        System.out.println("Points de vie max : " + character.getCaracteristique().getMaxHealth() +
                "\nPoints de vie actuels : " + character.getCaracteristique().getHealth() +
                "\nForce : " + character.getCaracteristique().getStrength() +
                "\nArmure : " + character.getCaracteristique().getArmor() + "\n");
    }

    public static void addAdditionalStats(int maxStatPoints) {
        System.out.println("Vous avez " + maxStatPoints + " à répartir :");
    }

    public static void addAdditionalStatsError(int pointsAwarded, int maxStatPoints) {
        if (pointsAwarded > maxStatPoints) {
            System.out.println("Trop de points ont été attribués !\n");
        } else {
            System.out.println("Vous n'avez pas attribués asssez de points...\n");
        }
    }

    public static void numberOfTurn(int currentTurn, int maxTurns){
        System.out.println("Tour " + (currentTurn) + "/" + maxTurns);
    }

    public static void pressTouchToContinue(){
        System.out.println("\nAppuyez sur une touche pour continuer...");
        ReadInput.readLine();
        System.out.println();
    }

    public static void rencontreAvecMaitreDArme(String playerName) {
        System.out.println("\nVous allez vous entraînez avec le maître d'arme afin de progresser.\n");
        int random = RandomUtil.randomInt(0, 4);
        switch (random)
        {
            case 0:
                System.out.println("Maître d'arme : HAHA "+ playerName +" ! Je vous attends !\n" +
                        "À moins que vous ne préfériez que l'on dise partout que vous êtes une petite pédale qui pisse dans son froc à l'idée de se battre !!");
                break;
            case 1:
                System.out.println("Après plusieurs échanges avec le maître d'arme, celui-ci tente de vous galvanisez avec sottises habituelle.\n" +
                        "Maître d'arme : J'ai l'impression de me battre contre une vieille...\n" +
                        "Maître d'arme : Allez, en garde ! Espèce de vieille pute dégarnie !");
                break;
            case 2:
                System.out.println("Par habitude des provocation du maître d'arme, vous décidez de lui couper l'herbe sous le pied et traiter son père d'unijambiste.\n" +
                        "Maître d'arme : Moi mon père est peut-être unijambiste mais ma femme n'a pas de moustache !\n" +
                        "Alors ça vient ? Ptite bite !");
                break;
            case 3:
                System.out.println("Maître d'arme : En garde, ma biquette ! Je vais vous découper le gras du cul, ça vous fera ça de moins à trimbaler !\n" +
                        "Maître d'arme : Allez ma p'tite cousine ! Secouez vous un peu les nichons !");
                break;
            case 4:
                System.out.println("Maître d'arme : ALLEZ, EN GARDE GROSSE CONNE !");
                break;
        }
        System.out.println("\nSuite à la rencontre avec le maître d'arme, vous progressez et montez d'un niveau !\n");
    }

    public static void rencontreAvecMerlin(String playerName) {
        System.out.println("\nVous allez à la rencontre de Merlin...\n");
        int random = RandomUtil.randomInt(0, 4);
        switch (random)
        {
            case 0:
                System.out.println("Celui-ci vous propose de vous soignez si vous avez la réponse à son énigme :\n" +
                        "Merlin : Qu'est ce qui est petit et marron ?\n" +
                        playerName + " : Un marron ?\n" +
                        "Merlin : Putain, il est fort le con !");
                break;
            case 1:
                System.out.println("Merlin : Attention messire, vous avez le choix dans la date\n" +
                        "Vous ne comprenez pas ce que Merlin raconte comme d'habitude...\n" +
                        "Cependant, vous ressentez une étrange sensation autour d'un de vos doigts...");
                break;
            case 2:
                System.out.println("Merlin : Salut Fred !\n" +
                        playerName + " : C'est qui Fred ?\n" +
                        "Merlin : Oh " + playerName + ", je ne vous avais pas vu, ce n'est rien c'est un ancien dialecte d'enchanteur...");
                break;
            case 3:
                System.out.println("Agacé par votre femme, vous demandez agressivement à Merlin une potion de soin pour votre prochaine quête.\n" +
                        "Merlin se retourne vers son armoire afin d'attraper une potion, puis baragouine dans sa barbe\n" +
                        "Merlin : Eh bien, nul n'est jamais assez fort pour ce calcul à ce que je vois.\n" +
                        "Dans le doute de ce qu'il a bien pu raconter, vous l'assomez avant de récupérer la potion au vol\n" +
                        "I'faut se méfier, avec les mecs à cran !");
                break;
            case 4:
                System.out.println("Merlin : Savez-vous ce qu'est que la contrepèterie ?\n" +
                        playerName + " : Non, qu'est ce que c'est que ça encore.\n" +
                        "Merlin : C'est l'art de décaler les sons !\n" +
                        playerName + " : Vous n'avez pas bientôt fini de jouer le poète, ça ne vous dirai pas de jouer le druide dès fois ?");
                break;
        }
        System.out.println("\nSuite à ce cet entretien avec Merlin, vous ne le comprenez toujours pas,\n" +
                "mais vous vous êtes totalement revigoré !\n");
    }
}
