public class Zad2_1 {


    public static int silniaPetla(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args) {

        int liczba = 5;
        System.out.println("Silnia " + liczba + " (pętla): " + silniaPetla(liczba));
    }
}
