//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double number1 = 3.14;
        double number2 = 2.26;

        // Логическая операция
        System.out.println((true && false) || (true && !false));

        // Тернарная операция
        System.out.println("Минимум: " + (number1 < number2 ? number1 : number2));

        int binaryNumber1 = 2; // 010
        int binaryNumber2 = 5; // 101

        // Поразрядные логические:
        System.out.println("Побитовое И: " + (binaryNumber1 & binaryNumber2));
        System.out.println("Побитовое ИЛИ: " + (binaryNumber1 | binaryNumber2));
        System.out.println("Побитовое XOR: " + (binaryNumber1 ^ binaryNumber2));
        System.out.println("Побитовое NOT: " + Integer.toBinaryString(~binaryNumber2));
        System.out.println("Сдвиг вправо: " + (binaryNumber2 >> binaryNumber1));

        // Сдвиг вправо
        System.out.println("Сдвиг вправо: " + (binaryNumber2 >>> binaryNumber1));
        // Сдвиг влево
        System.out.println("Сдвиг влево: " + (binaryNumber1 << binaryNumber2));
    }
}