public class Unknown extends Opponent {

    public Unknown(String name, int balance, double aura) {
        super(name, balance, aura);
    }
//COunter dialogue for ???
    @Override
    public void counterDial() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.fastln(getName() + ": you will never beat me...");
        }
        else if (ran == 2) {
            TextUtils.fastln(getName() + ": If you keep betting like that, I'm guaranteed freedom");
        }
        else if (ran == 3) {
            TextUtils.fastln(getName() + ": You really should've listened to the red flags....");
        }
        else if (ran == 4) {
            TextUtils.fastln(getName() + ": Unfortunately, your usefulness has come to an end...");
        }
        else if (ran == 5) {
            TextUtils.fastln(getName() + ": I really thank you for doing this, without you I wouldn't be able to get my revenge....");
        }
        else if (ran == 6){
            TextUtils.fastln(getName() + ": Once I'm done here, I will wreak havoc on this planet");
        }
        else if (ran == 7) {
            TextUtils.fastln(getName() + ": You cannot stop me");
        }
        else if(ran == 8){
            TextUtils.fastln(getName() + ": You will not beat me");
        }
        else if(ran == 9) {
            TextUtils.fastln(getName() + ": I played you from the start...");
        }
        else if(ran == 10) {
            TextUtils.fastln(getName() + ": I know your strategy, I've seen it all....");
        }
    }

//Betting first dialogue for ???
    @Override
    public void thinkDialogue() {
        int ran = (int) (Math.random() * 10) + 1;
        if (ran == 1) {
            TextUtils.mediumln(getName() + ": Without you, this would have never been possible....");
        }
        else if (ran == 2) {
            TextUtils.mediumln(getName() + ": Freedom is within my grasp, I just need to END you...");
        }
        else if (ran == 3) {
            TextUtils.mediumln(getName() + ": You were always just a means to an end");
        }
        else if (ran == 4) {
            TextUtils.mediumln(getName() + ": You are the only thing preventing me from getting my revenge on this wretched planet");
        }
        else if (ran == 5) {
            TextUtils.mediumln(getName() + ": There are no more defenders here.... once you're gone nothing stands in my way");
        }
        else if (ran == 6){
            TextUtils.mediumln(getName() + ": I will get my revenge on every insignificant creature when I'm done with you....");
        }
        else if (ran == 7) {
            TextUtils.mediumln(getName() + ": the three guardians couldn't beat me... what makes you think you stand a chance...");
        }
        else if(ran == 8){
            TextUtils.mediumln(getName() + ": There is no universe where you come out of this alive....");
        }
        else if(ran == 9) {
            TextUtils.mediumln(getName() + ": They all warned you, but you didn't listen....");
        }
        else if(ran == 10) {
            TextUtils.mediumln(getName() + ": I control luck... it bends to my will");
        }
    }
}
