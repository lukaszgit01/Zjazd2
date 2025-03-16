public class App
{
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Wartość zmiennej: " + num);
        changeValue(num);
        System.out.println("Wartość zmiennej po funkcji: " + num);

        IntegerWrapper number = new IntegerWrapper(5);
        System.out.println("Wartość przed funkcją: " + number.getValue());
        changeValue(number);
        System.out.println("Wartość po funkcji: " + number.getValue());
        change(number);
        System.out.println("Wartość po funkcji: " + number.getValue());
    }

    public static void changeValue(IntegerWrapper num) {
        num.setValue(10);
    }

    public static void change(IntegerWrapper num) {
        num = new IntegerWrapper(26);
    }

    public static void changeValue(int num) {
        num = 10;
        System.out.println("Wartość zmiennej wewnątrz funkcji: " + num);
    }
}

class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
