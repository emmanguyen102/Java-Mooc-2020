
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        Lukutilasto all = new Lukutilasto();
        Lukutilasto even = new Lukutilasto();
        Lukutilasto odd = new Lukutilasto();
        System.out.println("Anna lukuja:");
        while (true){
            int input = Integer.valueOf(lukija.nextLine());
            if (input == -1) {
                break;
            }
            all.lisaaLuku(input);
            if(input %2 == 0){
                even.lisaaLuku(input);
            } else {
                odd.lisaaLuku(input);
            }
        }
        System.out.println("Summa: "+ all.summa());
        System.out.println("Parillisten summa: "+ even.summa());
        System.out.println("Parittomien summa: "+ odd.summa());
    }
}
