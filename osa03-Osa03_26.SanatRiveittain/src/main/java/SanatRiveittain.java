
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true){
            String phrase = lukija.nextLine();
            if (phrase.equals("")) {
                break;
            }
            String[] pieces = phrase.split(" ");
            for(int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
    }
}
