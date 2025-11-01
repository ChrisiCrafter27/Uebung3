package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 0;
        int fix = 0;
        int wartend = 0;
        boolean istVoll = false;

        if(wartend < max - fix) {
            fix += wartend;
            wartend = 0;
            istVoll = false;
        } else {
            wartend -= max - fix;
            fix = max;
            istVoll = true;
        }

        //System.out.println("Max: " + max);
        //System.out.println("Fix: " + fix);
        //System.out.println("Wartend: " + wartend);
        //System.out.println("istVoll: " + istVoll);
    }
}
