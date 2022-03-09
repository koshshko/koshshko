package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ApplicationList {

    public static void main(String[] args) {
        /*
        Динамический или List
         */
        List<Integer> ints = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Boolean> booleans = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        // Основные операции
        ints.size(); // Получение длины листа
        ints.get(4); // Получение к элементу листа с номером 4
        ints.add(2); // Добавление в лист цифры 2
        ints.add(2, 5); // Добавление в лист цифры 5 на 2 позицию
        ints.clear(); // Очистка листа
        ints.isEmpty(); // проверка на пустоту (что у листа нет элементов)
        ints.contains(4); // проверяет содержит ли лист указанный элемент (4)
        ints.remove(4); // удаляет элемент под номером 4
        // ints.forEach(digit -> { digit = ... }); последовательный перебор всех элементов листа

        Random rnd = new Random();

        // Заполняем лист 10 элементами
        for (int i = 0; i < 10; i++) {
            ints.add(i * 2);
        }

        // Вывод элементов
        for (int i = 0; i < ints.size(); i++) {
            System.out.print(ints.get(i) + " ");
        }
        System.out.println();

        // Вывод элементов 2
        ints.forEach(i -> {
            System.out.print(i + " ");
        });
        System.out.println();

        // Вывод элементов 3
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }
}
