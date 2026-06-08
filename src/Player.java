import java.util.Scanner;

public class Player extends Character {
    private Scanner scnr = new Scanner(System.in);

    public Player(String name, int balance) {
        super(name, balance);
    }
//core mechanic of the game, before any roll there has to be a bet placed.
    public int chooseBet() {
        int ran = (int) (Math.random() * 5) + 1;
        if(ran == 1) {
            System.out.println("You(mentally): Alright, lets see what the best bet in this situation should be...");
            System.out.println("Balance: " + getBalance());
        }
        else if(ran == 2) {
            System.out.println("You(mentally): I wonder what I should bet..");
            System.out.println("Balance: " + getBalance());
        }
        else if (ran == 3) {
            System.out.println("You(mentally): my bet should be...");
            System.out.println("Balance: " + getBalance());
        }
        else if(ran == 4){
            System.out.println("You(mentally): Gotta play this smart... I think my bet will be...");
            System.out.println("Balance: " + getBalance());
        }
        else if (ran == 5) {
            System.out.println("You(mentally): Lets go with...");
            System.out.println("Balance: " + getBalance());
        }
        while (true) {
            if(scnr.hasNextInt()){
                int bet = scnr.nextInt();
                if (bet>0 && bet <= getBalance()){
                    return bet;
                }
                else if(bet<0) {
                    System.out.println("You(mentally): no... not quite right.. a bet can't be less than zero");
                }
                else if(bet==0){
                    System.out.println("You(mentally): I can't just play for free...");
                }
                else if (bet>getBalance()){
                   System.out.println("You(mentally): What am I thinking? I can't bet what I don't have, I'll end up in a seriously bad situation");
                }
            }
            else {
                System.out.println("Magic Wizard: No bro, it has to be a whole number");
                scnr.next();
            }
        }
    }
    //end of chooseBet
}
