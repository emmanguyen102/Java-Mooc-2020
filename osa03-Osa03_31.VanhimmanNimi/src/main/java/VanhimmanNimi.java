
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int oldest = 0;
        String nimi = "";
        while (true) {
            String phrase = lukija.nextLine();
            if (phrase.equals("")){
                break;
            }
            String[] parts = phrase.split(",");
            if (oldest < Integer.valueOf(parts[1])){
                oldest = Integer.valueOf(parts[1]);
                nimi = parts[0];
            }
        }
        System.out.println("Vanhimman nimi: " + nimi);
    }
}
