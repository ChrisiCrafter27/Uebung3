package h2;

public class H2_main {
    public static void main(String[] args) {
        int jahr = 2025;
        boolean schalt;

        schalt = (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0));

        //System.out.println(schalt);
    }
}
