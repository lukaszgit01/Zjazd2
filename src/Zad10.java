import java.util.Random;
import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Wybór poziomu trudności
        System.out.println("Wybierz poziom trudności:");
        System.out.println("1. Łatwy (1-50)");
        System.out.println("2. Średni (1-100)");
        System.out.println("3. Trudny (1-200)");

        System.out.print("Podaj poziom trudności: ");
        int poziomTrudnosci = scanner.nextInt();
        System.out.print("Podaj poziom trudności: ");
        int zakres = 0;
        int maxProby = 0;

        switch (poziomTrudnosci) {
            case 1:
                zakres = 50;
                maxProby = 15;
                break;
            case 2:
                zakres = 100;
                maxProby = 10;
                break;
            case 3:
                zakres = 200;
                maxProby = 8;
                break;
            default:
                System.out.println("Niepoprawny wybór. Wybieram poziom średni.");
                zakres = 100;
                maxProby = 10;
        }


        int wylosowanaLiczba = random.nextInt(zakres) + 1;

        int liczbaProb = 0;
        int zgadnietaLiczba = 0;


        while (zgadnietaLiczba != wylosowanaLiczba && liczbaProb < maxProby) {
            System.out.print("Zgadnij liczbę (1-" + zakres + "): ");
            zgadnietaLiczba = scanner.nextInt();
            liczbaProb++;


            if (zgadnietaLiczba > wylosowanaLiczba) {
                System.out.println("Za dużo.");
                podpowiedz(zgadnietaLiczba, wylosowanaLiczba);
            } else if (zgadnietaLiczba < wylosowanaLiczba) {
                System.out.println("Za mało.");
                podpowiedz(zgadnietaLiczba, wylosowanaLiczba);
            }
        }


        if (zgadnietaLiczba == wylosowanaLiczba) {
            System.out.println("Gratulacje! Odgadłeś liczbę " + wylosowanaLiczba + " w " + liczbaProb + " próbach. :D");
        } else {
            System.out.println("Niestety, nie udało Ci się odgadnąć liczby. Liczba to: " + wylosowanaLiczba);
        }
    }


    public static void podpowiedz(int zgadnietaLiczba, int wylosowanaLiczba) {
        int roznica = Math.abs(zgadnietaLiczba - wylosowanaLiczba);

        if (roznica >= 50) {
            System.out.println("Dużo za mało/dużo za dużo.");
        } else if (roznica >= 20) {
            System.out.println("Trochę za mało/trochę za dużo.");
        } else {
            System.out.println("Bardzo blisko!");
        }
    }
}
