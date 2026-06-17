public class Orc extends Opponent{

    public Orc(String name, int balance, double aura) {
        super(name, balance, aura);
    }

    @Override
    //dialogue for the Orc Queen
    public void counterDial() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.fastln(getName() + ": You poor soul, unfortunately for you I have a job to do....");
        } else if (ran == 2) {
            TextUtils.fastln(getName() + ": You got past by loyal guards, but now I must put an end to your journey");
        } else if (ran == 3) {
            TextUtils.fastln(getName() + ": You have laid waste to all the creatures before you... I cannot show you mercy");
        } else if (ran == 4) {
            TextUtils.fastln(getName() + ": Unfortunately theres no easy way around this... may fate favor the bold");
        } else if (ran == 5) {
            TextUtils.fastln(getName() + ": I'm not like the others, strategy is futile against me");
        } else if (ran == 6) {
            TextUtils.fastln(getName() + ": If you don't give this match your all, theres no way to beat me");
        } else if (ran == 7) {
            TextUtils.fastln(getName() + ": I am Archepello, the Queen of the Orcs, I will not fail to protect this planet");
        } else if (ran == 8) {
            TextUtils.fastln(getName() + ": Your journey will soon come to an end, you poor soul..");
        } else if (ran == 9) {
            TextUtils.fastln(getName() + ": betting like that is not in your favor....");
        } else if (ran == 10) {
            TextUtils.fastln(getName() + ": for the fate of this planet, I must stop you....");
        }
    }

    //dialogue for when the orc queen goes first

    @Override
    public void thinkDialogue() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.mediumln(getName() + ": you'd be wise to put thought into your bet...");
        }
        else if (ran == 2) {
            TextUtils.mediumln(getName() + ": I won't be so easily defeated.....");
        }
        else if (ran == 3) {
            TextUtils.mediumln(getName() + ": Perhaps you should take a more bold approach when betting, it might give you a better chance at beating me...");
        }
        else if (ran == 4) {
            TextUtils.mediumln(getName() + ": This isn't just a game... its life or death....");
        }
        else if (ran == 5) {
            TextUtils.mediumln(getName() + ": Unfortunately for you... I was born for this.....");
        }
        else if (ran == 6){
            TextUtils.mediumln(getName() + ": Shall we try and spice things up a bit...");
        }
        else if (ran == 7) {
            TextUtils.mediumln(getName() + ": I can sense your nervousness.... you know your end is near");
        }
        else if(ran == 8){
            TextUtils.mediumln(getName() + ": I'll make sure your end is painless...");
        }
        else if(ran == 9) {
            TextUtils.mediumln(getName() + ": You poor soul... you have no idea what you've walked into");
        }
        else if(ran == 10) {
            TextUtils.mediumln(getName() + ": My strategy gets better as we play more matches....");
        }
    }
}
