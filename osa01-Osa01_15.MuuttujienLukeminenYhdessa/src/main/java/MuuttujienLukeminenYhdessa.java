
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String viesti = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double luku2 = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!"); 
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        System.out.println("Syötit merkkijonon "+viesti);
        System.out.println("Syötit kokonaisluvun "+luku);
        System.out.println("Syötit liukuluvun "+luku2);
        System.out.println("Syötit totuusarvon "+arvo);

    }
}
