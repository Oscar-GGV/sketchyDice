public class PlayerTest {
    public static void main(String[]args){
        Player one = new Player("Oscar", 100, 3.0);
        System.out.println(one.chooseBet());

        //this is used to check if the betAura method works
        System.out.println("Aura is " + one.getAura());

    }
}
