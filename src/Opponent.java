public class Opponent extends Character {

    public Opponent(String name, int balance, double aura) {
        super(name, balance, aura);
    }

    //used in the situation where the player bets first
    public int counterBet(Player player, int playerBet) {
      int oppBet = 0;
       //gets the aura of the player
        double playerAura = player.getAura();
        //gets the aura of the NPC
        double opponentAura = getAura();
//special CASE** player pretty much wins if the player aura is 3 times the aura of the opponent aura -> gives a good reason to play risky
        if (playerAura > (opponentAura * 3) && getBalance() < player.getBalance()){
            TextUtils.medium(getName() + ": You think I'm scared of you?");
            TextUtils.fastln(getName() + ": ... I'm putting my all into this one, winner takes all");
            oppBet = getBalance();
        }
        //SPECIAL CASE **
        else if (playerAura > (opponentAura * 4) && (getBalance() * 2) > player.getBalance()){
            counterDial();
            oppBet = getBalance();
        }
        //SPECIAL CASE ***
        // makes it easier to win, opponent plays riskier -> matches end faster if player has 2 times more aura than opponent
        else if (playerAura > (opponentAura * 2) && getBalance() < player.getBalance()) {
            counterDial();
            int ran = (int) (Math.random() * 2) + 1;
            if (ran == 1) {
                oppBet = getBalance()/2;
            }
            else {
                oppBet = getBalance();
            }
        }
        //Generic case
        else if (playerAura > opponentAura) {
            counterDial();
            //if opp balance <= player balance then opp bet is half of total balance
            if (getBalance() <= player.getBalance()) {
                oppBet = getBalance();
            }

            else if(getBalance() > player.getBalance()){
                oppBet = getBalance()/2;
            }
        }
        //SPEcIAL CASE**
        //player has 3 times less aura than opponent
        else if ((playerAura * 3) < opponentAura) {
            counterDial();
            int ran = (int) (Math.random() * 100) + 1;
//opp plays safer if opponent has bad aura
            if (1 <= ran && ran <= 20) {
                oppBet = getBalance();
            }
            else if (20 < ran && ran <= 50) {
                oppBet = getBalance()/2;
            }
            else if (50 < ran && ran <=100) {
                oppBet = getBalance()/3;
            }
        }
       //Generic CASE player aura less than opp aura
        else if (playerAura <= opponentAura) {
            int choice = (int)(Math.random() * 2) + 1;
            //if player aura is less than the opponent aura -> more likely if a player plays not too risky not too safe...
            //splits into a 50/50 chance of going down each path
            //opp balance is bigger than 2 times the player bet
            if (choice == 1 && getBalance() > (playerBet * 2)){
                counterDial();
                oppBet = playerBet;
            }
            //should make it easier for player once i add the higher bet gimmick
            //opp balance is bigger than player bet
            else if (choice == 1 && getBalance() > playerBet) {
                System.out.println(getName() + ": I'll play it smart...");
                oppBet = playerBet/2;
                }
            //opp balance is less than player bet
            else if (choice == 1 && getBalance() <= playerBet) {
                int random = (int) (Math.random() * 3) + 1;
                System.out.println(getName() + ": I'll leave it up to fate");
                oppBet = getBalance();
            }
            //balance is greater than player bet
            else if (choice == 2 && getBalance() > playerBet){
                System.out.println(getName() + ": You're pathetic.... you haven't realized the trick yet.,");
                oppBet = playerBet/2;
            }
            //balance is less than player bet
            else if (choice == 2 && getBalance() <= playerBet) {
                System.out.println(getName() + ": lets see if I can survive....");
                oppBet = playerBet;
            }
        }
        return oppBet;
    }



    //used in the situation where the opponent bets first
    public int placeBet(){
        int oppBet = 0;
        int choice = (int) (Math.random() * 100) + 1;
        //if you're lucky the opponent will bet it all on a whim 1% chance or if opponent balance is really low -> helps shorten games.
        if (choice == 1 || getBalance() <= 20){
            thinkDialogue();
            oppBet = getBalance();
        }
        //bet is 50% of Balance... 9% chance
        else if (choice > 1 && choice < 10) {
            thinkDialogue();
            oppBet = getBalance()/2;
        }
        //bet is 33.33 percent of balance... 20% chance
        else if (choice >= 10 && choice <= 30) {
           thinkDialogue();
            oppBet = getBalance()/3;
        }
        //bet is 25% of Balance... 30% chance
        else if (choice > 30 && choice <= 60){
           thinkDialogue();
            oppBet = getBalance()/4;
        }
        //bet is 20% of Balance.... 30% chance
        else if (choice > 60 && choice <= 90){
            thinkDialogue();
            oppBet = getBalance()/5;
        }
        //bet is 16% of balance... 10% chance
        else if (choice > 90 && choice <= 100) {
            oppBet = getBalance()/6;
        }
        return oppBet;
    }

    //opponent dialogue used when making bets
    public void thinkDialogue(){
       int choice = (int) (Math.random() * 10) + 1;
       if (choice == 1) {
           TextUtils.mediumln(getName() + ": I wonder what you'll bet against me...");
       }
       else if (choice == 2) {
           TextUtils.mediumln(getName() + ": I wonder if I should play it smart....");
       }
       else if (choice == 3) {
           TextUtils.mediumln(getName() + ": Perhaps I should play it risky....");
       }
       else if (choice == 4) {
           TextUtils.mediumln(getName() + ": If you're not a chicken maybe we should put it all on the line?");
       }
       else if (choice == 5) {
           TextUtils.mediumln(getName() + ": I bet you don't even have half the money I have");
       }
       else if (choice == 6){
           TextUtils.mediumln(getName() + ": I wonder how many rounds you can last till you gp broke");
       }
       else if (choice == 7) {
           TextUtils.mediumln(getName() + ": doesn't it make you nervous? if you hit 0 you DIE");
       }
       else if(choice == 8){
           TextUtils.mediumln(getName() + ": Just give up and go home");
       }
       else if(choice == 9) {
           TextUtils.mediumln(getName() + ": forget about any promises you made and walk away with your life.....");
       }
       else if(choice == 10) {
           TextUtils.mediumln(getName() + ": I truly hope for the planet's sake you don't reach him....");
       }
    }

    //opponent dialogue for counterBet
    public void counterDial() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1){
            TextUtils.fastln(getName() + ": You got me......  sike!");
        }
        else if (ran == 2) {
            TextUtils.fastln(getName() + ": I wonder what plan you have to beat me...");
        }
        else if (ran == 3) {
            TextUtils.fastln(getName() + ": Do you really think you can get to him?");
        }
        else if (ran==4) {
            TextUtils.fastln(getName() + ": I wonder who you'll stop at.....");
        }
        else if (ran ==5) {
            TextUtils.fastln(getName() + ": its no use... I already won.....");
        }
        else if (ran == 6){
            TextUtils.fastln(getName() + ": I wonder how much longer you can keep this up....");
        }
        else if(ran == 7) {
            TextUtils.fastln(getName() + ": I'm always three steps ahead of you....");
        }
        else if(ran == 8) {
            TextUtils.fastln(getName() + ": who will bet higher this round....");
        }
        else if (ran == 9) {
            TextUtils.fastln(getName() + ": why don't we take it up a notch....");
        }
        else if (ran == 10){
            TextUtils.fastln(getName() + ": can you handle the pressure?");
        }
    }



}


