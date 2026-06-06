public class Character {
    private String name;
    private float aura;
    private int balance;

    public Character(String name, int balance){
        this.name = name;
        this.balance = balance;
        this.aura = 0;
    }
    //returns STRING name
    public String getName(){
        return name;
    }

    //returns FLOAT aura
    public float getAura(){
        return aura;
    }

    //returns INT balance
    public int getBalance(){
        return balance;
    }

    //add aura
    public void addAura(float amount){
        aura += amount;
    }

    //remove aura
    public void loseAura(float amount){
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
