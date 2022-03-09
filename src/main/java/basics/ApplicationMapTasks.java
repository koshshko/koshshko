package basics;

import java.util.HashMap;

public class ApplicationMapTasks {

    /*
    Дана строка. Нужно вернуть букву, которая в этой строке встречается наиболее часто
    */
    public static void main(String[] args) {
        char c = getMostFrequentChar("Greeting, you're learning Java!");
        System.out.println(c);
    }

    public static char getMostFrequentChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);

            if (map.containsKey(currentChar)) {
                int currentAmount = map.get(currentChar);
                currentAmount++;
                map.put(currentChar, currentAmount);
            } else {
                map.put(currentChar, 1);
            }
        }

        char c = s.charAt(0);
        int max = map.get(c);

        for (Character key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                c = key;
            }
        }

        return c;
    }
}
