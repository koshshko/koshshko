package basics;

import java.util.HashMap;
import java.util.Map;

public class ApplicationMap {

    /*
    "яблоко" -> 2
    "бананы" -> 10
    "киви" -> 6
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        /*
        аналогично с листами и сетами
         */
        map.clear();
        map.isEmpty();
        map.size();
        map.get("яблоко");

        map.put("яблоко", 2); // Положить по ключу "яблоко" значение 2
        map.put("бананы", 10);
        map.put("киви", 6);
        map.containsKey("test"); // Проверить есть ли ключ "test" в мапе
        map.containsValue(10); // Проверить есть ли в мапе значение 10
        map.entrySet(); // Получаем все пары карты
        map.keySet(); // Получаем сет ключей карты
        map.values(); // Получаем лист значений

        map.put("киви", 12);
        for (String key : map.keySet()) {
            System.out.print(key + " -> " + map.get(key));
            System.out.println();
        }

        map.forEach((k, v) -> {
            System.out.print(k + " -> " + v);
            System.out.println();
        });
    }
}
