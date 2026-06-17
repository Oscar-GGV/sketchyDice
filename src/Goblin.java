public class Goblin extends Opponent {

    public Goblin(String name, int balance, double aura) {
        super(name, balance, aura);
    }

    @Override
    //counter dialogue for the Goblin King
    public void counterDial() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.fastln(getName() + ": I am the perfect Goblin, I therefore cannot be stopped Ze Ha Ha HA HAA");
        } else if (ran == 2) {
            TextUtils.fastln(getName() + ": unfortunately I cannot let you past me... it's my job to stop you");
        } else if (ran == 3) {
            TextUtils.fastln(getName() + ": you somehow got past my greedy servants... your tricks won't work against me.... ");
        } else if (ran == 4) {
            TextUtils.fastln(getName() + ": Gimme all of your gold, walk away while you still have the autonomy to do so...");
        } else if (ran == 5) {
            TextUtils.fastln(getName() + ": Theres no point in strategizing against me... I win no matter what");
        } else if (ran == 6) {
            TextUtils.fastln(getName() + ": You think you can beat me? Give it your best shot");
        } else if (ran == 7) {
            TextUtils.fastln(getName() + ": I am the Goblin King... the final opponent you get to face");
        } else if (ran == 8) {
            TextUtils.fastln(getName() + ": Nothing personal.... we just have to stop you....");
        } else if (ran == 9) {
            TextUtils.fastln(getName() + ": You won't get past me betting like that....");
        } else if (ran == 10) {
            TextUtils.fastln(getName() + ": give it your all, or this game will never end....");
        }
    }

    @Override
    //specific dialogue for Goblin king when they place the bet first
    public void thinkDialogue() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.mediumln(getName() + ": make sure you really think about your bet... it could be what leads to your end....");
        }
        else if (ran == 2) {
            TextUtils.mediumln(getName() + ": I wonder who will have a higher bet this round...");
        }
        else if (ran == 3) {
            TextUtils.mediumln(getName() + ": in order to reach him, you have to be bold with your bets....");
        }
        else if (ran == 4) {
            TextUtils.mediumln(getName() + ": aren't you scared? your end is inevitable...");
        }
        else if (ran == 5) {
            TextUtils.mediumln(getName() + ": Betting cowardly won't get us anywhere....");
        }
        else if (ran == 6){
            TextUtils.mediumln(getName() + ": Lets get this game over with....");
        }
        else if (ran == 7) {
            TextUtils.mediumln(getName() + ": doesn't it make you nervous? if you hit 0 you DIE");
        }
        else if(ran == 8){
            TextUtils.mediumln(getName() + ": It's not too late to walk away, just leave....");
        }
        else if(ran == 9) {
            TextUtils.mediumln(getName() + ": It's all a lie... manipulation is in the works.");
        }
        else if(ran == 10) {
            TextUtils.mediumln(getName() + ": My gold is my treasure, I won't let you have it...");
        }

    }
}


