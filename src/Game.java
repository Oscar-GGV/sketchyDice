import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Player player;
    private Goblin boss1;
    private Orc boss2;
    private Wizard boss3;
    private Unknown finalBoss;

    //for goblin enemies
    private ArrayList<Opponent> opponents1;
    //orc enemies
    private ArrayList<Opponent> opponents2;
    //wizard enemies
    private ArrayList<Opponent> opponents3;
    Scanner scnr = new Scanner(System.in);

    public Game() {
        int ans = 0;
        initOpponents();
        if (startGame()==true) {
            System.out.println("System: restart the program to try again");
        }

    }

    public void initOpponents() {
        opponents1 = new ArrayList<>();
        opponents1.add(new Opponent("Dumb Goblin", 50, 0));
        opponents1.add(new Opponent("Ominous Goblin", 75, 5));
        opponents1.add(new Opponent("Nice Goblin", 100, 15));
        opponents2 = new ArrayList<>();
        boss1 = new Goblin("The Goblin King", 200, 25);
        opponents2.add(new Opponent("Funny Orc", 225, 30));
        opponents2.add(new Opponent("Real Orc", 250, 35));
        opponents2.add(new Opponent("Energetic Orc", 275, 40));
        boss2 = new Orc("Emerald Queen of Orcs", 550, 50);
        opponents3 = new ArrayList<>();
        opponents3.add(new Opponent("Heinous Wizard", 575, 55));
        opponents3.add(new Opponent("Intrepid Wizard", 600, 60));
        opponents3.add(new Opponent("Magnificent Wizard", 625, 65));
        boss3 = new Wizard("Mars, The Wizard King", 1250, 80);
        finalBoss = new Unknown("???", 5000, 200);
    }

    public Player createPlayer() {
        TextUtils.slow("???: Hey you.....");
        TextUtils.fastln("... Yeah YOU....");
        TextUtils.mediumln("???: whats yar name?");
        String name = scnr.next();
        Player player = new Player(name, 10, 0);
        TextUtils.slow("???: well then " + name + " ");
        TextUtils.mediumln("look.. I'd hate to rush ya, but I kinda need ya to do me a favor....");
        TextUtils.slow("???: Yar be extremely broke... ");
        TextUtils.mediumln("... I'll give ya a little sum of money on the condition that ya come and find me...");
        TextUtils.slowln("???: ... and free me");
        return player;
    }

    public void exposition() {
        TextUtils.fastln("The year is 7562, on the planet Xenon3");
        TextUtils.fastln("The trees are orange, the sea is red, and the atmosphere is a beautiful orange, with black clouds floating in the sky, everything is perfect....");
        TextUtils.slow("Except you...  ");
        TextUtils.fast("... you're exactly at the wrong place, at the wrong time.... you're looking for scraps in an old ghost town... and then you come across something...");
        TextUtils.slowln("... or someone...");
    }

    //dialogue at the beginning of the game
    public void playerdial1() {
        TextUtils.mediumln(player.getName() + ": well that guy was extremely weird");
        TextUtils.mediumln(player.getName() + ": He gave me like 10 dabloons....");
        TextUtils.slowln(player.getName() + ": find him... and free him... he was right there and then dissapeared");
        TextUtils.mediumln(player.getName() + ": now what am I gonna have to do with these things");
    }

    public void sombradial1() {
        TextUtils.slow("???: Oye...    ");
        TextUtils.mediumln("the names sombra.... cause you know... I'm a dark shadow");
        TextUtils.fastln("La Sombra Oscura: I was bound a long time ago to that guy you just encountered a couple minutes ago...");
        TextUtils.fastln("La Sombra Oscura: you're the first he has gotten his grips since it happened..... you shouldn't even be here...");
        TextUtils.medium("La Sombra Oscura: Listen... before the curse kicks in and we get thrown into it...");
        TextUtils.fastln(".... whatever you do, don't f-");
        TextUtils.medium("La Sombra Oscura: You will be put into matches of die, you will play against his different creations. You will acumulate riches as you win, but if you reach a balance of 0.....");
        TextUtils.slowln("... you will die.");
        TextUtils.mediumln("La Sombra Oscura: if you survive, you will face him and decide his fate");
        TextUtils.mediumln("La Sombra Oscura: Lets get to it!");
    }


    public Boolean startGame() {
        exposition();
        player = createPlayer();
        playerdial1();
        sombradial1();
        Boolean isDead = false;
        for (int i = 0; i < opponents1.size(); i++) {
            if(isDead){
                break;
            }
            Opponent opponent = opponents1.get(i);
            Match round = new Match(player, opponent);
            round.play();
            if (round.getWinner() == 1) {
                System.out.println("You get to live for another match....");
            } else if (round.getWinner() == 2) {
                System.out.println("You died");
                isDead = true;
            }
        }
        //first boss fight
        if(!isDead) {
            Match bfight1 = new Match(player, boss1);
            bfight1.play();
            if (bfight1.getWinner() == 1) {
                System.out.println("You obtained the goblin key");
            } else {
                System.out.println("You died");
                isDead = true;
            }
        }

        if(!isDead) {
            for (int i = 0; i < opponents2.size(); i++) {
                Opponent opponent = opponents2.get(i);
                Match round = new Match(player, opponent);
                round.play();
                if (round.getWinner() == 1) {
                    System.out.println("You get to live for another match....");
                } else if (round.getWinner() == 2) {
                    System.out.println("You died");
                    isDead = true;
                    break;
                }
            }
        }

        //second boss fight
        if (!isDead) {
            Match bfight2 = new Match(player, boss2);
            bfight2.play();
            if (bfight2.getWinner() == 1) {
                System.out.println("You obtained the Orc key");
            } else  {
                System.out.println("You died");
                isDead = true;

            }
        }

        if(!isDead) {
            for (int i = 0; i < opponents3.size(); i++) {
                Opponent opponent = opponents3.get(i);
                Match round = new Match(player, opponent);
                round.play();
                if (round.getWinner() == 1) {
                    System.out.println("You get to live for another match....");
                } else if (round.getWinner() == 2) {
                    System.out.println("You died");
                    isDead = true;
                    break;
                }
            }
        }

        //third boss fight
        if(!isDead) {
            Match bfight3 = new Match(player, boss3);
            bfight3.play();
            if (bfight3.getWinner() == 1) {
                System.out.println("You obtained the wizard key");
            } else {
                System.out.println("You died");
                isDead = true;
            }
        }

        //final boss
        if(!isDead) {
            if (player.getAura() > 100) {
                Match bfight4 = new Match(player, finalBoss);
                bfight4.play();
                if (bfight4.getWinner() == 1) {
                    System.out.println("You obtained the wizard key");
                } else {
                    System.out.println("You died");
                    isDead = true;
                }
            } else {
                System.out.println("You Win the Game!!!!");
            }
        }

return isDead;
    }
}