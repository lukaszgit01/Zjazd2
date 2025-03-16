import java.util.Random;

public class Zad3_2 {


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 8, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }


    public static void fibonacciZLosowaniem() {
        Random random = new Random();
        int pozycja = random.nextInt(10) + 1;
        System.out.println("Losowa pozycja w ciągu Fibonacciego: " + pozycja);
        System.out.println("Element na pozycji " + pozycja + " w ciągu Fibonacciego to: " + fibonacci(pozycja));
    }

    public static void main(String[] args) {

        fibonacciZLosowaniem();
    }
}
