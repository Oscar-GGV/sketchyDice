import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Player player;
    private ArrayList<Opponent> opponents;
    Scanner scnr = new Scanner(System.in);

    public Game() {
      initOpponents();
      startGame();

    }
    public void initOpponents(){
        opponents = new ArrayList<>();
        opponents.add(new Opponent("Steven the stinky Wizard", 50, 1));
        opponents.add(new Opponent("Ronnie the Wizard", 100, 2));
        opponents.add(new Opponent("Johnny the Goblin", 300, 1));
        opponents.add(new Opponent("Elphaba the Wild Witch", 500, 5));
        opponents.add(new Opponent("The evil wizard", 1000, 10 ));
        opponents.add(new Opponent("The corrupt King", 10000, 20));
    }

    public Player createPlayer(){
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
    public void exposition(){
        TextUtils.fastln("The year is 7562, on the planet Xenon3");
        TextUtils.fastln("The trees are orange, the sea is red, and the atmosphere is a beautiful orange, with black clouds floating in the sky, everything is perfect....");
        TextUtils.slow("Except you...  ");
        TextUtils.fast("... you're exactly at the wrong place, at the wrong time.... you're looking for scraps in an old ghost town... and then you come across something...");
        TextUtils.slowln("... or someone...");
    }
    //dialogue at the beginning of the game
    public void playerdial1(){
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


    public void startGame(){
        exposition();
        player = createPlayer();
        playerdial1();
        sombradial1();
        for (int i = 0; i < opponents.size(); i++){
            Opponent opponent = opponents.get(i);
            Match round = new Match(player, opponent);
            round.play();
            if (round.getWinner() == 1) {
                System.out.println("You get to live for another match....");
            }
            else if(round.getWinner() == 2) {
                System.out.println("You died");
            }
        }
    }

}
