package basics;

public class ApplicationCycles {

    public static void main(String[] args) {
        /*
        Для определенного количества вызовов
        Для неопределенного количества
         */

        int sum = 0;
        int max = 10;

        // Цикл для
        for (int i = 2; i < max; i = i + 2) {
            sum += i;
            System.out.println(i);
        }

        sum = 0;
        int i = 0;

        // Цикл "пока"
        while (i < max) {
            sum += i;
            i++;
        }

        sum = 0;
        i = 0;

        // Цикл "до"
        do {
            sum += i;
            i++;
        } while (i < max);

        System.out.println(i);
    }
}
