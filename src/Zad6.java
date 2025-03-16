import java.util.Arrays;
import java.util.Scanner;

public class Zad6 {


    public static void obliczStatystyki(int... liczby) {

        if (liczby.length == 0) {
            System.out.println("Brak danych do obliczeń.");
            return;
        }


        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }


        double srednia = (double) suma / liczby.length;


        Arrays.sort(liczby);
        double mediana;
        if (liczby.length % 2 == 0) {

            mediana = (liczby[liczby.length / 2 - 1] + liczby[liczby.length / 2]) / 2.0;
        } else {

            mediana = liczby[liczby.length / 2];
        }


        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }


    public static void obliczStatystyki(double... liczby) {

        if (liczby.length == 0) {
            System.out.println("Brak danych do obliczeń.");
            return;
        }


        double suma = 0;
        for (double liczba : liczby) {
            suma += liczba;
        }


        double srednia = suma / liczby.length;


        Arrays.sort(liczby);
        double mediana;
        if (liczby.length % 2 == 0) {

            mediana = (liczby[liczby.length / 2 - 1] + liczby[liczby.length / 2]) / 2.0;
        } else {

            mediana = liczby[liczby.length / 2];
        }


        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę elementów: ");
        int n = scanner.nextInt();


        int[] liczbyCalkowite = new int[n];
        double[] liczbyZmiennoprzecinkowe = new double[n];


        System.out.println("Podaj liczby całkowite:");
        for (int i = 0; i < n; i++) {
            liczbyCalkowite[i] = scanner.nextInt();
        }


        System.out.println("Podaj liczby zmiennoprzecinkowe:");
        for (int i = 0; i < n; i++) {
            liczbyZmiennoprzecinkowe[i] = scanner.nextDouble();
        }


        System.out.println("\nDla liczb całkowitych:");
        obliczStatystyki(liczbyCalkowite);

        System.out.println("\nDla liczb zmiennoprzecinkowych:");
        obliczStatystyki(liczbyZmiennoprzecinkowe);


        scanner.close();
    }
}
