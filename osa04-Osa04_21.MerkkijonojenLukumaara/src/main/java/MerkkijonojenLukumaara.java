
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int count = 0;
        while (true) {
            String line = lukija.nextLine();
            if(line.equals("loppu")){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
