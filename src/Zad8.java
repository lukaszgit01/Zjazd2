import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Witaj w kasie biletowej!");
        boolean kontynuuj = true;

        while (kontynuuj) {
            System.out.println("\nWybierz bilet:");
            System.out.println("1. Bilet normalny - 10 zł");
            System.out.println("2. Bilet ulgowy - 5 zł");
            System.out.println("3. Bilet miesięczny - 30 zł");
            System.out.print("Wybierz numer biletu (1-3): ");


            int wybor = scanner.nextInt();


            switch (wybor) {
                case 1:
                    System.out.println("Wybrałeś bilet normalny. Cena: 10 zł");
                    break;
                case 2:
                    System.out.println("Wybrałeś bilet ulgowy. Cena: 5 zł");
                    break;
                case 3:
                    System.out.println("Wybrałeś bilet miesięczny. Cena: 30 zł");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                    continue;
            }


            System.out.print("\nCzy chcesz kupić kolejny bilet? (tak/nie): ");
            String odpowiedz = scanner.next();


            if (odpowiedz.equalsIgnoreCase("nie")) {
                kontynuuj = false;
                System.out.println("Dziękujemy za skorzystanie z kasy biletowej!");
            }
        }


        scanner.close();
    }
}
