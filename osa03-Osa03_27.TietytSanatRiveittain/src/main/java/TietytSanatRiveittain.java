
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true){
            String phrase = lukija.nextLine();
            String[] pieces = phrase.split(" ");
            if (phrase.equals("")){
                break;
            }
            for(int i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")){
                    System.out.println(pieces[i]);
                }
            }
            
        }
        
    }
}
