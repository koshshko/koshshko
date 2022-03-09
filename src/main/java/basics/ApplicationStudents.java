package basics;

import java.util.*;

public class ApplicationStudents {
    /*
    Дан лист, в котором хранятся оценки студентов. У каждого студента может быть
    разное количество оценок. Написать программу, которая:
    1. Заполняет оценки для каждого студента
    2. Передает в функцию лист с оценками
    3. Выводит на экран средний балл по каждому студенту
    */
    /*
    Введите количество студентов:
    2
    Введите размерность и оценки через пробел:
    5 4 5 4 5 5
    Введите размерность и оценки через пробел:
    3 2 3 4
    4 5 4 5 5
    2 3 4
    4.6
    3.0
     */
    public static void main(String[] args) {
        List<List<Integer>> list = enterStudentsData();
        printListOfLists(list);

        List<Double> avgs = getAverage(list);
        printList(avgs);
    }

    private static List<Double> getAverage(List<List<Integer>> students) {
        List<Double> averages = new ArrayList<>();
        /*
        Блок для примера
         */
        int[][] st = new int[3][3];

        // 1. Вариант если используем массив данных (двумерный)
        for (int i = 0; i < st.length; i++) {
            int sum = 0; // avg = sum / count;
            for (var mark : st[i]) {
                sum += mark;
            }
            averages.add((double) sum / st[i].length);
        }

        // 2. Массив данных (двумерный) и цикл foreach
        for (var student : st) {
            int sum = 0; // avg = sum / count;
            int count = 0;

            for (var mark : student) {
                sum += mark;
                count++;
            }
            averages.add((double) sum / count);
        }
        /*
        Конец блока для примера
         */

        // 3. Вариант с листами и циклом foreach
        for (List<Integer> student : students) {
            int sum = 0; // avg = sum / count;
            for (int mark : student) {
                sum += mark;
            }
            averages.add((double)sum / student.size());
        }

        return averages;
    }

    private static List<List<Integer>> enterStudentsData() {
        // Список группы (количество элементов = количеству студентов)
        List<List<Integer>> list = new ArrayList<>();

        // Вводим количество студентов
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество студентов:");
        int size = in.nextInt();

        // Заполняем данные по каждому студенту
        for (int i = 0; i < size; i++) {
            // Указываем количество оценок для каждого студента
            System.out.println("Введите размерность и оценки через пробел:");
            int currentSize = in.nextInt();

            // Заполняем то количество оценок для студента, которое указали ранее
            List<Integer> currentList = new ArrayList<>();
            for (int j = 0; j < currentSize; j++) {
                currentList.add(in.nextInt());
            }

            // Добавляем оценки конкретного студента в список со студентами
            list.add(currentList);
        }
        in.close();

        return list;
    }

    private static void printListOfLists(List<List<Integer>> lists) {
        for (var list : lists) {
            for (var item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    private static void printList(List<Double> list) {
        for (var element : list) {
            System.out.print(element + " ");
            System.out.println();
        }
    }
}
