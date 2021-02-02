
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String phrase = lukija.nextLine();
            if (phrase.equals("")){
                break;
            }
            String[] pieces = phrase.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }
    }
}
