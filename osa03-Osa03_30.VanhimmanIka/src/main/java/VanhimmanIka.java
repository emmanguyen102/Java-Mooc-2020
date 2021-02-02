
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int oldest = 0;
        while (true) {
            String input = lukija.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (oldest < Integer.valueOf(parts[1])){
                oldest = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Vanhimman ikä: "+ oldest);    

    }
}
