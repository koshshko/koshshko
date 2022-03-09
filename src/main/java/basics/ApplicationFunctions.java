package basics;

public class ApplicationFunctions {

    public static void main(String[] args) {
        // Есть книга. k строк на странице, n номер строки от начала книги
        // Определить номер строки на странице
        /*
        1. k = 0, n = 10 => error
        2. k = 1, n = 10 => 1
        3. k = 2, n = 1 => 1
        4. k = 2, n = 2 => 2
        5. k = 2, n = 3 => 1
         */
//        System.out.println(countStringNumber(0, 10)); // error
        System.out.println(countStringNumber(1, 10)); // 1
        System.out.println(countStringNumber(2, 1)); // 1
        System.out.println(countStringNumber(2, 2)); // 2
        System.out.println(countStringNumber(2, 3)); // 1

        countStringNumber();
        String a = getOne();

        int f = 5;
        int c = sum(1, 5); // 1 + 5
        int d = sum(c, f); // c + f
        int d2 = sum(3, d); // 3 + d
    }

    static int countStringNumber(int k, int n) {
        return (n - 1) % k + 1;
    }

    // Имя функции подчиняется тем же правилам, что имя переменной
    static void countStringNumber() {
        System.out.println("Function works");
    }

    static String getOne() {
        return "1";
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
