package basics;

public class ApplicationDates {

    /*
    Условие: Если время от 5 до 12 -> "Доброе утро, {username}"
    Условие: Если время от 12 до 16 -> "Добрый день, {username}"
    Условие: Если время от 16 до 23 -> "Добрый вечер, {username}"
    Условие: Если время от 23 до 5 -> "Доброй ночи, {username}"
     */
    public static void main(String[] args) {
        greet(4, 0, 0, "Роман"); // Ночь
        greet(5, 0, 0, "Роман"); // Утро
        greet(11, 0, 0, "Роман"); // Утро
        greet(12, 0, 0, "Роман"); // День
        greet(15, 0, 0, "Роман"); // День
        greet(16, 0, 0, "Роман"); // Вечер
        greet(22, 0, 0, "Роман"); // Вечер
        greet(23, 0, 0, "Роман"); // Ночь
    }

    static void greet(int h, int m, int s, String username) {
        String dayTime = "Доброй ночи, ";

        if (h >= 5 && h <12) dayTime = "Доброе утро, ";
        if (h >= 12 && h <16) dayTime = "Добрый день, ";
        if (h >= 16 && h <23) dayTime = "Добрый вечер, ";

        System.out.println(dayTime + username);
    }
}
