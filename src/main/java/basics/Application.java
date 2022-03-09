package basics;

public class Application {

    public static void main(String[] args) {
        // 3.5 => 3 или 4?
        int a = 0;
        // + - * /, остаток от деления
        int a1 = 5 + 7 - 5 * 9 / 7 % 2;

        // 35 => 35.0
        // 9999 => 9999.0
        double b = 1.0;
        // + - * /
        double b1 = 1 + (1.25 - 5.5 * 6.9) / 46.3;
        double b2 = b / 3;

        // true или false
        boolean isTrue = true;
        // && || !
        System.out.println(isTrue && true);
        System.out.println(isTrue || true);
        System.out.println(!isTrue);

        // Символ
        char c = '1';

        // Набор символов
        String t = "Test";
        String s = "Test" + " Automation"; // Test Automation
        String s1 = String.format("%s Automation", t); // Test Automation

        /* Имя переменной:
        - не начинается с цифры
        - не содержит спецсимволов
        - может содержать буквы латинского алфавита и цифры
        - регистр имеет значение
         */
        int F21 = 1;
        int f21 = 1;

        int future; // future = null

        int totalAmount, returnBackward = 1;
        String TOTAL_AMOUNT, RETURN_BACKWARD = "1";

        // Есть книга. k строк на странице, n номер строки от начала книги
        // Определить номер строки на странице
        int k = 20;
        int n = 10;
    }
}
