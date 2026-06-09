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

        if (playerAura < opponentAura && getBalance() < player.getBalance()){
            System.out.println(getName() + ": You think I'm scared of you?");
            System.out.println(getName() + ": ... I'm putting my all into this one, winner takes all");
            oppBet = getBalance();
        }
        else if (playerAura > opponentAura) {
            System.out.println(getName() + ": ... lets make this game fun");
            if (getBalance() < playerBet) {
                oppBet = playerBet/2;
            }
            else {
                oppBet = playerBet;
            }
        }
        else if (playerAura == opponentAura) {
            int choice = (int)(Math.random() * 2) + 1;
            if (choice == 1 && getBalance() > playerBet) {
                System.out.println(getName() + ": I'll play it smart...");
                oppBet = playerBet/3;
                }
            else if (choice == 1 && getBalance() <= playerBet) {
                int random = (int) (Math.random() * 5) + 1;
                System.out.println(getName() + ": I'll leave it up to fate");
                oppBet = playerBet/random;
            }
            else if (choice == 2 && getBalance() > playerBet){
                System.out.println(getName() + ": You're pathetic.... you haven't realized the trick yet.,");
                oppBet = 1;
            }
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
        System.out.println(getName() + ": ... I wonder what I'll bet against you...");
        int choice = (int) (Math.random() * 10) + 1;
        if (choice == 1){
            System.out.println(getName() + ": Lets see if fortune favors the bold...");
            oppBet = getBalance();
        }
        else if (choice == 2 || choice == 10) {
            System.out.println(getName() + ": Lets play it fun");
            oppBet = getBalance()/2;
        }
        else if (choice == 3 || choice == 9 || choice == 6) {
            System.out.println(getName() + ": okay...");
            oppBet = getBalance()/3;
        }
        else {
            System.out.println(getName() + ": ......");
            oppBet = getBalance()/4;
        }
        return oppBet;
    }
}
