
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti?");
        int end = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int start = Integer.valueOf(lukija.nextLine());
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
