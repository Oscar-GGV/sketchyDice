public class OrcTest {
    public static void main(String[] args) {
        Orc boss2 = new Orc("The Orc Queen", 1000, 50);
        Player play = new Player("Test2", 200, 20);
int bet = play.chooseBet();
boss2.counterBet(play, bet);
boss2.placeBet();
    }
}
