package basics;

public class ApplicationCyclesTasks {

    public static void main(String[] args) {
        /*
        Человек кладет в банк сумму N на один год под K процентов годовых
        Проценты начисляются каждый месяц на остаток
         */
        System.out.println(getSum(1000, 12));

        /*
        Посчитать сумму цифр числа
        1000 -> 1
        1265 -> 14
         */
        System.out.println(getDigitsSum(1000));
        System.out.println(getDigitsSum(1265));
    }

    public static double getSum(int n, double k) {
        double monthlyPercent = k / 12;
        double result = n;

        for (int i = 0; i < 12; i++) {
            result = result + result / 100.0 * monthlyPercent;
        }

        return result;
    }

    public static int getDigitsSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
