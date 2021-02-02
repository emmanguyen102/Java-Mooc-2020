
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0){
                break;
            }
            count1 += 1;
            count2 += luku;
        }
        System.out.println("Lukuja yhteensä " + count1);
        System.out.println("Lukujen summa " + count2);

    }
}
