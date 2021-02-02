
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int a = 0;
        String nimi = "";
        int summa = 0;
        int count = 0;
        while(true){
            String phrase = lukija.nextLine();
            if (phrase.equals("")) {
                break;
            }
            String[] parts = phrase.split(",");
            if (a < parts[0].length()){
                a = parts[0].length();
                nimi = parts[0];
            }
            
            summa += Integer.valueOf(parts[1]);
            count += 1;
        }
        double avg = (double) summa/count;
        System.out.println("Longest name: " + nimi);
        System.out.println("Average of the birth years: " + avg);

    }
}
