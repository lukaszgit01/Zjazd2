import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();


        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();


        System.out.print("Podaj operację (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);

        double wynik = 0;
        boolean dzieleniePrzezZero = false;


        switch (operacja) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':

                if (liczba2 == 0) {
                    dzieleniePrzezZero = true;
                } else {
                    wynik = liczba1 / liczba2;
                }
                break;
            default:
                System.out.println("Nieprawidłowa operacja!");
                break;
        }


        if (!dzieleniePrzezZero) {
            System.out.println("Wynik: " + wynik);
        } else {
            System.out.println("Błąd! Nie można dzielić przez zero.");
        }

        scanner.close();
    }
}
