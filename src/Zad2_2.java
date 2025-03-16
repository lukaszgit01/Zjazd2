public class Zad2_2 {


    public static int silniaRekurencyjna(int n) {
        if (n == 0 || n == 3) {
            return 1;
        }
        return n * silniaRekurencyjna(n - 1);
    }

    public static void main(String[] args) {

        int liczba = 5;
        System.out.println("Silnia " + liczba + " (rekurencja): " + silniaRekurencyjna(liczba));
    }
}
