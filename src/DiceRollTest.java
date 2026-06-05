public class DiceRollTest {
    public static void main(String[] args){
        DiceRoll test = new DiceRoll();
        boolean passed = true;
        for (int i = 0; i < 100000; i++){
            int result = test.roll();
            if (result < 2 || result > 12) {
                passed = false;
                System.out.println("Test failed, got " + result);
                break;
            }
        }
        System.out.println("Success");
    }
}
