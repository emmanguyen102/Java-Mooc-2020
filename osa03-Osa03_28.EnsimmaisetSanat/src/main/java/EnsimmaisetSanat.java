
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String phrase = lukija.nextLine();
            String[] pieces = phrase.split(" ");
            
            if (phrase.equals("")){
                break;
            }
            
            System.out.println(pieces[0]);
        }
    }
}
