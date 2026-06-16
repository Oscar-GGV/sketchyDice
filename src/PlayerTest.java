public class PlayerTest {
    public static void main(String[]args){
        Player one = new Player("Oscar", 100, 3.0);
        System.out.println(one.chooseBet());

        //this is used to check if the betAura method works
        System.out.println("Aura is " + one.getAura());
//Aura bug is not from anything in the Player class june 15, 2026
    }
}
