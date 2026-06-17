public class GoblinTest {
    public static void main(String[] args) {
        Goblin boss1 = new Goblin("The Goblin King", 500, 20);
        Player play = new Player("Test", 200, 20);
        int bet = play.chooseBet();
        boss1.counterBet(play, bet);
        boss1.placeBet();
    }
}
