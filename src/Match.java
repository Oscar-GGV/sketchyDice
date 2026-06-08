public class Match {
    private Player player;
    private Opponent opponent;
    private boolean playerStarts;

    public Match(Player player, Opponent opponent){
        this.player = player;
        this.opponent = opponent;
    }
    //once either player or opponent gets to 0 balance or below, the game is over
    public void play() {
        while (player.getBalance() > 0 && opponent.getBalance() > 0){
            playRound();
            playerStarts = !playerStarts;
        }
    }

    public void playRound(){
        int oppBet = 0;
        int playerBet = 0;
       //if the player starts the opp counter bets
        if (playerStarts) {
            playerBet = player.chooseBet();
            player.loseMoney(playerBet);
            oppBet = opponent.counterBet(player, playerBet);
            opponent.loseMoney(oppBet);
        }
        //otherwise opp bets first and player counter bets
        else {
            oppBet = opponent.placeBet();
            opponent.loseMoney(oppBet);
            playerBet = player.chooseBet();
            player.loseMoney(playerBet);
        }
        int totalBet = (oppBet + playerBet) * 2;
        System.out.println("La Sombra Oscura: First we will start with the rolls for " + player.getName());
        DiceRoll diceroll = new DiceRoll();
        int playroll = diceroll.roll();
        System.out.println("La Sombra Oscura: " + player.getName() + " rolled " + playroll);
        System.out.println("La Sombra Oscura: Now lets do the rolls for " + opponent.getName());
        int opproll = diceroll.roll();
        System.out.println("La Sombra Oscura: " + opponent.getName() + " rolled " + opproll);
        if (playroll > opproll) {
            System.out.println("La Sombra Oscura: " + player.getName() + " wins");
            player.addMoney(totalBet);
            player.addAura(2.0);
        }
        else if (playroll < opproll) {
            System.out.println("La Sombra Oscura: " + opponent.getName() + " wins");
            opponent.addMoney(totalBet);
            opponent.addAura(2.0);
        }
        else {
            System.out.println("La Sombra Oscura: Nobody wins I take half");
            player.addMoney(playerBet/2);
            opponent.addMoney(oppBet/2);
        }
    }
}
