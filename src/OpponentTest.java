public class OpponentTest {
    public static void main(String[] args){
        Opponent opp = new Opponent("Jeffery", 10000, 1.0);
        Player play = new Player("Bruh", 500, 1.0);
      //same aura no aura added
      //for more aura comment out .play.addAura
        opp.addAura(20);
       // play.addAura(30);
       int bet = play.chooseBet();
       System.out.println(opp.counterBet(play, bet));
    }
}
