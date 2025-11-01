package h1;

public class H1_main {
    public static void main(String[] args) {
        double guthaben = -0;
        double monEingang = 0;
        int rating = 0;
        boolean warnhinweis = false;
        boolean negativ  = false;

        warnhinweis = false;
        negativ = guthaben < 0;
        if(guthaben > 0) rating += 3;
        else if(guthaben == 0) rating += 2;
        else {
            if(monEingang >= -guthaben) rating += 1;
            else if(rating < 0) warnhinweis = true;
        }

        //System.out.println("Rating is: " + rating);
        //if(warnhinweis) System.out.println("Warning!");
    }
}
