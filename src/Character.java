public class Character {
    private String name;
    private double aura;
    private int balance;

    public Character(String name, int balance, double aura){
        this.name = name;
        this.balance = balance;
        this.aura = aura;
    }
    //returns STRING name
    public String getName(){
        return name;
    }

    //returns FLOAT aura
    public double getAura(){
        return aura;
    }

    //returns INT balance
    public int getBalance(){
        return balance;
    }

    //add aura
    public void addAura(double amount){
        aura += amount;
    }

    //remove aura
    public void loseAura(double amount){
        aura -= amount;
    }

    //add money
    public void addMoney(int amount) {
        balance += amount;
    }

    //lose money
    public void loseMoney(int amount) {
        balance -= amount;
        if (balance < 0){
            balance = 0;
        }
    }

}
