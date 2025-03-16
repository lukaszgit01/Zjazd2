import java.util.Scanner;

public class Zad4 {


    public static void wypiszNieparzyste(int a, int b) {

        if (a <= b) {
            System.out.println("Liczby nieparzyste od " + a + " do " + b + ":");
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        else {
            System.out.println("Liczby nieparzyste od " + a + " do " + b + " (w odwrotnej kolejności):");
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();


        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();


        wypiszNieparzyste(liczba1, liczba2);


        scanner.close();
    }
}
