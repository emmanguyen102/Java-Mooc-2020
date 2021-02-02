
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String line = lukija.nextLine();
            if(line.equals("loppu")){
                break;
            }
            int num = Integer.valueOf(line);
            System.out.println(num*num*num);
        }
    }
}
