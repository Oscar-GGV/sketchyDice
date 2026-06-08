public class MatchTest {
    public static void main(String[] args){
        Opponent opp = new Opponent("Megatron", 600);
        opp.addAura(69);
        Player play = new Player("Optimus Prime", 700);
        play.addAura(100);
        Match round = new Match(play, opp);
        round.play();
    }
}
