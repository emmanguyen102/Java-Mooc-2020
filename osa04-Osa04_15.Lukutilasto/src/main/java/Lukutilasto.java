
public class Lukutilasto {
    private int lukujenMaara;
    private int summa = 0;

    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
        this.lukujenMaara = 0;
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        this.lukujenMaara += 1;
        this.summa += luku;
    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän
        return this.lukujenMaara;
    }
    
    public int summa() {
        // kirjoita koodia tähän
        return this.summa;
    }

    public double keskiarvo() {
        // kirjoita koodia tähän
        if (this.lukujenMaara == 0) {
            return 0.0;
        }
        return 1.0 * this.summa / this.lukujenMaara;
    }
    
}
