
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.print("Etunimi: ");
            String fName = lukija.nextLine();
            
            if (fName.equals("")){
                break;
            }
            System.out.print("Sukunimi: ");
            String lName = lukija.nextLine();
            System.out.print("Identification number: ");
            String num = lukija.nextLine();
           
            henkilotiedot.add(new Henkilotieto(fName, lName, num));
        }
        System.out.println("");
        for (Henkilotieto person: henkilotiedot) {
            System.out.println(person.getEtunimi() + " " + person.getSukunimi());
        }

    }
}
