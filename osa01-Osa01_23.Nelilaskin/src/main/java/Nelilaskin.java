
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        int tulos1 = luku1 + luku2;
        int tulos2 = luku1 - luku2;
        int tulos3 = luku1 * luku2;
        double tulos4 = (double) luku1/luku2;
        System.out.println(luku1 + " + " + luku2 + " = " + tulos1);
        System.out.println(luku1 + " - " + luku2 + " = " + tulos2);
        System.out.println(luku1 + " * " + luku2 + " = " + tulos3);
        System.out.println(luku1 + " / " + luku2 + " = " + tulos4);
        

    }
}
