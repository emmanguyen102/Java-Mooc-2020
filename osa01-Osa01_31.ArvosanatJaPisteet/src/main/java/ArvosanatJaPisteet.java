
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]:");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku < 0) {
            System.out.println("mahdotonta!");
        } else if (0 <= luku & luku <= 49) {
            System.out.println("hylätty");
        } else if (50 <= luku & luku <= 59) {
            System.out.println("1");
        } else if (60 <= luku & luku <= 69){
            System.out.println("2");
        } else if (70 <= luku & luku <= 79) {
            System.out.println("3");
        } else if (80 <= luku & luku <= 89) {
            System.out.println("4");
        } else if (90  <= luku  & luku <= 100) {
            System.out.println("5");
        } else {
            System.out.println("uskomatonta!");
        }
    }
}
