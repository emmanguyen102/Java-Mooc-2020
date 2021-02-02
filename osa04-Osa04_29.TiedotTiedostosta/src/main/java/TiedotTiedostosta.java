
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String file = lukija.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                if (age == 1) {
                    System.out.println(name + ", ikä: "+age+" vuosi");
                } else {
                    System.out.println(name + ", ikä: "+age+" vuotta");
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
