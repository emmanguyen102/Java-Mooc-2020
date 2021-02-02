
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true){
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")){
                break;
            }
            System.out.print("Pituus: ");
            int length = Integer.valueOf(lukija.nextLine());
            ohjelmat.add(new TelevisioOhjelma(nimi, length));
        }
        System.out.print("Ohjelman maksimipituus?" );
        int max = Integer.valueOf(lukija.nextLine());
        for (TelevisioOhjelma name: ohjelmat){
            if(name.getPituus() <= max){
                System.out.println(name);
            }
        }
    }
}
