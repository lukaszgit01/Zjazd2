public class Zad7 {
    public static void main(String[] args) {
        String fruit = "apple";

        switch (fruit) {
            case "apple":
                System.out.println("To jest jabłko!");
                break;
            case "banana":
                System.out.println("To jest banan!");
                break;
            case "orange":
                System.out.println("To jest pomarańcza!");
                break;
            default:
                System.out.println("Nieznany owoc.");
        }
    }
}
