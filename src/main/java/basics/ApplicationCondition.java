package basics;

public class ApplicationCondition {

    public static void main(String[] args) {

        int a = 5;
        int b = 1;
        int max;

        // Неполное условие
        if (a > b) {
        }

        // Полное условие
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        /*
        >
        <
        >=
        <=
        ==
        !=
         */

        boolean isAdult = true;
        if (!isAdult) {
        }

        System.out.println(max);
    }
}
