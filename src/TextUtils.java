public class TextUtils {
//can be used using TextUtils.(method)
    //print waits 200 milliseconds and has new line at the end of the string
    public static void slowln(String text){
        for (char c: text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    //same as prev but no new line at the end
    public static void slow(String text){
        for (char c: text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //now waits 100 miliseconds every print with new line at the end of string
    public static void mediumln(String text){
        for (char c: text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

//same as prev but no new line at the end
    public static void medium(String text){
        for (char c: text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //print waits 50 mil seconds and has a new line at the end of the string
    public static void fastln(String text){
        for (char c: text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    //same as orevious but no new line.
    public static void fast(String text){
        for (char c: text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
