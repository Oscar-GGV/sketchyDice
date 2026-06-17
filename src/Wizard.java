public class Wizard extends Opponent {

    public Wizard(String name, int balance, double aura) {
        super(name, balance, aura);
    }
//couter dialogue for the WIzard king
    @Override
    public void counterDial() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.fastln(getName() + ": I'd put more effort into betting if I were you....");
        }
        else if (ran == 2) {
            TextUtils.fastln(getName() + ": If you don't try there no way you can ever neat me...");
        }
        else if (ran == 3) {
            TextUtils.fastln(getName() + ": I can't believe you were able to beat everyone betting like this....");
        }
        else if (ran == 4) {
            TextUtils.fastln(getName() + ": I know every trick in the book, you can't beat me");
        }
        else if (ran == 5) {
            TextUtils.fastln(getName() + ": I have to stop you... no matter the cost....");
        }
        else if (ran == 6){
            TextUtils.fastln(getName() + ": Fate is on my side... the world is relying on me....");
        }
        else if (ran == 7) {
            TextUtils.fastln(getName() + ": Unfortunately for you there's no spell that can save you from me");
        }
        else if(ran == 8){
            TextUtils.fastln(getName() + ": You won't feel a thing when you lose...");
        }
        else if(ran == 9) {
            TextUtils.fastln(getName() + ": I have to end you....");
        }
        else if(ran == 10) {
            TextUtils.fastln(getName() + ": I am the most powerful wizard in the universe... I won't lose to you....");
        }
    }

    @Override
    public void thinkDialogue() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.mediumln(getName() + ": rejoice in my presence, play it smart and you might get to live another round....");
        }
        else if (ran == 2) {
            TextUtils.mediumln(getName() + ": I've seen every possible way this battle ends.... strategy is futile");
        }
        else if (ran == 3) {
            TextUtils.mediumln(getName() + ": I am the warrior of knowledge and magic... there is no way you can beat me");
        }
        else if (ran == 4) {
            TextUtils.mediumln(getName() + ": This is where your journey comes to an end....");
        }
        else if (ran == 5) {
            TextUtils.mediumln(getName() + ": You are certainly formidable, but I cannot let you past me...");
        }
        else if (ran == 6){
            TextUtils.mediumln(getName() + ": You have killed everything in your path.... for what? You have no idea what you plan to unleash");
        }
        else if (ran == 7) {
            TextUtils.mediumln(getName() + ": I will stop you... I have to...");
        }
        else if(ran == 8){
            TextUtils.mediumln(getName() + ": I know every bet you will make... can you really beat me");
        }
        else if(ran == 9) {
            TextUtils.mediumln(getName() + ": I cannot show you mercy, for I am the final guardian");
        }
        else if(ran == 10) {
            TextUtils.mediumln(getName() + ": I am the most intelligent being on this planet... you don't seriously think you can win...");
        }
    }
}
