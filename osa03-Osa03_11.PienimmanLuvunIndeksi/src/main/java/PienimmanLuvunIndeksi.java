
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999){
                break;
            }
            lista.add(luettu);
        }  
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        int smallest = lista.get(0);
        for (int i = 0; i < lista.size(); i ++) {
            int number = lista.get(i);
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Pieni luku on "+smallest);
        
        int index = 0;
        for (int i = 0; i < lista.size(); i ++) {
            if (lista.get(i) == smallest) {
                index = i;
                System.out.println("Pienin luku löytyy indeksistä " + index);
            }
        }
        
    }
}
