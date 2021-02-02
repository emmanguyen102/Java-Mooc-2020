
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen:");
        int luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int luku2 = Integer.valueOf(lukija.nextLine());
        int sum =0;
        for ( int i = luku1; i <= luku2; i++) {
            sum += i;
        }
        System.out.println("Summa on " + sum);
    }   
}
