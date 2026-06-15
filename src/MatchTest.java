public class MatchTest {
    public static void main(String[] args){
        Opponent opp = new Opponent("Megatron", 600, 0.0);
        opp.addAura(69);
        Player play = new Player("Optimus Prime", 700, 0.0);
        play.addAura(100);
        Match round = new Match(play, opp);
        round.play();
        if (round.getWinner() == 1){
            System.out.println("The winner is the player");
        }
        else {
            System.out.println("The winner is the opponent");
        }
    }
}
