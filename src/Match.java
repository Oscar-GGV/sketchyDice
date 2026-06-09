public class Match {
    private Player player;
    private Opponent opponent;
    private boolean playerStarts;
    private int roundWinner;
    private int matchWinner;

    public static final int playerWin = 1;
    public static final int opponentWin = 2;
    public static final int tie = 3;

    public Match(Player player, Opponent opponent){
        this.player = player;
        this.opponent = opponent;
    }
    //once either player or opponent gets to 0 balance or below, the game is over
    public void play() {
        //game continues as long as neither balance is less than 0
        while (player.getBalance() > 0 && opponent.getBalance() > 0){
            playRound();
            playerStarts = !playerStarts;
        }
        //checks and sets who the match winner is
        if(player.getBalance() <= 0){
            matchWinner = opponentWin;
        }
        else {
            matchWinner = playerWin;
        }
    }

    public void playRound(){
        int oppBet = 0;
        int playerBet = 0;
       //if the player starts the opp counter bets
        if (playerStarts) {
            System.out.println("La Sombra Oscura: " + player.getName() + " goes first...");
            playerBet = player.chooseBet();
            player.loseMoney(playerBet);
            System.out.println("La Sombra Oscura: Now " + opponent.getName() + " goes....");
            oppBet = opponent.counterBet(player, playerBet);
            opponent.loseMoney(oppBet);
        }
        //otherwise opp bets first and player counter bets
        else {
            System.out.println("La Sombra Oscura: " + opponent.getName() + " goes first...");
            oppBet = opponent.placeBet();
            opponent.loseMoney(oppBet);
            System.out.println("La Sombra Oscura: Now " + player.getName() + " goes....");
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
            System.out.println("System: " + totalBet + " goes to " + player.getName());
            player.addAura(2.0);
            System.out.println("----------------------------");
            roundWinner = playerWin;
        }
        else if (playroll < opproll) {
            System.out.println("La Sombra Oscura: " + opponent.getName() + " wins");
            opponent.addMoney(totalBet);
            System.out.println("System: " + totalBet + " goes to "  + opponent.getName());
            opponent.addAura(2.0);
            System.out.println("----------------------------");
            roundWinner = opponentWin;
        }
        else {
            System.out.println("La Sombra Oscura: Nobody wins I take half");
            player.addMoney(playerBet/2);
            opponent.addMoney(oppBet/2);
            System.out.println("----------------------------");
            roundWinner = tie;
        }
    }
    public int getWinner(){
        return matchWinner;
    }
}
