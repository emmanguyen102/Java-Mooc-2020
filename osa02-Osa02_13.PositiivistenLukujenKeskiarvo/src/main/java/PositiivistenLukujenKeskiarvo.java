
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0){
                break;
            }
            count1 += 1;
            if (luku > 0){
                count2 += 1;
                count3 += luku;
            }
        }
        if(count1 == 0){
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            double keskiarvo = (double) count3/count2;
            System.out.println(keskiarvo);
        }
    }
}
