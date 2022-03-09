package basics;

import java.util.ArrayList;
import java.util.List;

public class ApplicationListTasks {

    /*
    Есть массив элементов
    Нужно вернуть лист, содержащий только четные элементы этого массива
     */
    public static void main(String[] args) {
        int[] array = new int[] {1, 0, 5, 6, 2, 15, 75, -18};
        getEvens(array).forEach(i -> {
            System.out.print(i + " ");
        });
    }

    public static List<Integer> getEvens(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
