package basics;

import java.util.Random;

public class ApplicationArrays {

    public static void main(String[] args) {
        // Объявление массива
        // 1, 1, 2, 3, 5, 8 ...
        int[] array = new int[7];
        int[] emptyArray;

        // Инициализация
        int[] array2 = new int[] {1, 2, 3, 4};

        /*
        №     | 0 1 2 3  4  5 6
        value | 5 7 2 9  -1 0 3
         */
        Random rnd = new Random();
        int min = 20;
        int max = 50;

        // Заполнение массива
        for (int i = 0; i < 7; i++) {
            array[i] = rnd.nextInt(max - min) + min; // Случайное число от 0 до 100
        }

        // Вывод массива на экран
        for (int i = 0; i < 7; i++) {
            System.out.println(array[i]);
        }

        System.out.println(sum(array));

        // Многомерные
        /*
        строка №1 - 5 8 9 3 4 7 5
        строка №2 - 6 8 3 3 0 1 3
        строка №3 - 3 6 4 3 0 1 2
         */
        int[][] twoDimensionalArray = new int[3][7];

        // n-мерный массив
        int[][][][][] nDimensionalArray = new int[3][7][2][6][1];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                twoDimensionalArray[i][j] = rnd.nextInt(100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Сумма элементов массива
    public static int sum(int[] array) {
        int sum = 0;
        int len = array.length; // Определяем длину массива и записывает в переменную len

        for (int i = 0; i < len; i++) {
            sum += array[i];
        }

        return sum;
    }

    // Максимальный элемент массива
    public static int max(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}
