public class Zadanie9
{
    public static void main(String[] args) {
        int num = 5; // Zmienna typu prymitywnego (int)
        System.out.println("Wartość zmiennej: " + num);

        changeValue(num); // Przekazanie zmiennej typu prymitywnego (kopii zmiennej)
        System.out.println("Wartość zmiennej po funkcji: " + num);
        // num nie zmienia się, bo int jest przekazywany przez wartość, a nie referencję

        IntegerWrapper number = new IntegerWrapper(5); // Obiekt typu IntegerWrapper
        System.out.println("Wartość przed funkcją: " + number.getValue());

        changeValue(number); // Zmiana właściwości obiektu przez referencję
        System.out.println("Wartość po funkcji: " + number.getValue());
        // number zmienia swoją wartość, ponieważ obiekt jest przekazywany przez referencję

        change(number); // Nowy obiekt tworzony w funkcji (nie wpływa na oryginalny obiekt)
        System.out.println("Wartość po funkcji: " + number.getValue());
        // number nie zmienia się, ponieważ w funkcji zmieniamy tylko lokalną referencję num
    }

    // Funkcja przyjmująca zmienną typu prymitywnego
    public static void changeValue(int num) {
        num = 10; // Zmieniamy kopię zmiennej num, nie ma to wpływu na oryginalną zmienną w main
        System.out.println("Wartość zmiennej wewnątrz funkcji: " + num);
    }

    // Funkcja przyjmująca obiekt IntegerWrapper
    public static void changeValue(IntegerWrapper num) {
        num.setValue(10); // Zmieniamy wartość właściwości obiektu num
    }

    // Funkcja zmieniająca referencję do obiektu
    public static void change(IntegerWrapper num) {
        num = new IntegerWrapper(26); // Tworzymy nowy obiekt, ale zmiana dotyczy tylko lokalnej zmiennej num
    }
}
