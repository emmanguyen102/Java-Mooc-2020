
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        System.out.print("From where? ");
        int index1 = Integer.valueOf(lukija.nextLine());
        System.out.print("To where? ");
        int index2 = Integer.valueOf(lukija.nextLine());
        
        for (int i = index1; i <= index2; i++) {
            System.out.println(luvut.get(i));
        }

    }
}
