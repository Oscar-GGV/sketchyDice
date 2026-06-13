import java.util.Scanner;

public class Player extends Character {
    private Scanner scnr = new Scanner(System.in);

    public Player(String name, int balance, double aura) {
        super(name, balance, aura);
    }
//core mechanic of the game, before any roll there has to be a bet placed.
    public int chooseBet() {
           //random player dialogue before every bet
            playDial();
            System.out.println("Balance: " + getBalance());
            //below gets the bet...
        while (true) {
            if(scnr.hasNextInt()){
                int bet = scnr.nextInt();
                betAura(bet);
                if (bet>0 && bet <= getBalance()){
                    return bet;
                }
                else if(bet<0) {
                    TextUtils.fastln( getName()+ ": no... not quite right.. a bet can't be less than zero");
                }
                else if(bet==0){
                    TextUtils.fastln(getName() + ": I can't just play for free...");
                }
                else if (bet>getBalance()){
                   TextUtils.fastln(getName() + ": What am I thinking? I can't bet what I don't have, I'll end up in a seriously bad situation");
                }
            }
            else {
                TextUtils.fastln("La Sombra Oscura: No bro, it has to be a whole number");
                scnr.next();
            }
        }
    }
    public void playDial() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.fastln(getName() + ": Gotta think this through...");
        }
        else if (ran == 2) {
            TextUtils.fastln(getName() + ": if I play riskier there might be a benefit?");
        }
        else if (ran == 3) {
            TextUtils.fastln(getName() + ": Gotta play this smart... I think my bet will be...");
        }
        else if (ran == 4) {
            TextUtils.fastln(getName() + ": my bet should be...");
        }
        else if (ran == 5) {
            TextUtils.fastln(getName() + ": Alright, lets see what the best bet in this situation should be...");
        }
        else if (ran == 6) {
            TextUtils.fastln(getName() + ": Lets go with...");
        }
        else if (ran == 7) {
            TextUtils.fastln(getName() + ": I wonder if betting cowardly negatively impacts me...");
        }
        else if(ran ==8) {
            TextUtils.fastln(getName() + ": I get it now, theres always a smart bet to make...");
        }
        else if (ran == 9){
            TextUtils.fastln(getName() + ": maybe I should just leave it to luck...");
        }
        else if (ran == 10) {
            TextUtils.fastln(getName() + ": alrighty then, lets see what bet can get me to the end...");
        }
    }

    //removes or adds aura depending on how much the bet made is compared to player balance
    //if the bet is below 1% of the players balance, you lose aura
    //same thing goes for 5% you just lose less
    //
    public void betAura(int bet) {
        //1%
        if (bet < getBalance()/100) {
            loseAura(2.0);
        }
        //5%
        else if(bet < getBalance()/20){
            loseAura(1.5);
        }
        //12.5%
        else if(bet< getBalance()/8) {
            loseAura(1.0);
        }
        //25%
        else if (bet < getBalance()/4) {
            loseAura(.5);
        }
        //from 25% to 49% you don't lose or gain anything
        else if (bet < getBalance()/2) {

        }
        //from 50 to 74% yoy gain
        else if (bet < (getBalance() * 3)/4) {
            addAura(.5);
        }
        //75 to 99% you gain
        else if(bet < getBalance()){
            addAura(1);
        }
        //100% of your balance is bet you get a bunch of aura
        else if(bet == getBalance()) {
            addAura(2.0);
        }
    }
    //end of chooseBet
}
