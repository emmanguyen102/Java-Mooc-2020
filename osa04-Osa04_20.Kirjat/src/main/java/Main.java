
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<Book> books = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true){
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")){
                break;
            }
            System.out.print("Sivuja: ");
            int sivu = Integer.valueOf(lukija.nextLine());
            System.out.print("Julkaisuvuosi: ");
            int year = Integer.valueOf(lukija.nextLine());
            
            books.add(new Book(nimi, sivu, year));
        }
        System.out.println("");
        System.out.print("Mitä tulostetaan?" );
        String word = lukija.nextLine();
        
        if (word.equals("nimi")){
            for(Book book: books){
                System.out.println(book.getNimi());
            }
        }
        if (word.equals("kaikki")){
            for(Book book: books){
                System.out.println(book);
            }
        }
    }
}
