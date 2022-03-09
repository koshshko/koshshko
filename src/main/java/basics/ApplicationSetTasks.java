package basics;

import net.bytebuddy.utility.RandomString;

import java.util.*;

public class ApplicationSetTasks {

    /*
    Выбрать из массива и вывести только уникальные
     */
    public static void main(String[] args) {
        int[] arr = new int[50];

        Random rnd = new Random();
        for (int i = 0; i < 50; i++) {
            int num = rnd.nextInt(10);
            System.out.print(num  + " ");
            arr[i] = num;
        }

        System.out.println();

        unique(arr).forEach(i -> {
            System.out.print(i + " ");
        });
    }

    public static Set<Integer> unique(int[] array) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        return set;
    }

    public static List<Integer> uniqueList(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < list.size(); j++) {
                if (array[i] == list.get(j)) {
                    isFound = true;
                    break; // Прерывает текущую итерацию цикла и выходит из цикла
                }
            }

            if (!isFound) {
                list.add(array[i]);
            }
        }

        return list;
    }
}
