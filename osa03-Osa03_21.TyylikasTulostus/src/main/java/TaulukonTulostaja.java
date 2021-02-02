
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int index = 0;
        while (index < taulukko.length-1) {
            int number = taulukko[index];
            System.out.print(number + ", ");
            index = index + 1;
        }
        System.out.print(taulukko[taulukko.length-1]);
    }
}
