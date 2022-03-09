package basics;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ApplicationSet {

    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<>();

        /*
        Аналогично с листами
         */
        ints.clear();
        ints.contains(2);
        ints.isEmpty();
        ints.add(2);
        ints.remove(2);
        ints.size();

        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(5);
            ints.add(num);

            System.out.print(num + " -> ");
            ints.forEach(digit -> {
                System.out.print(digit + " ");
            });
            System.out.println();
        }
    }
}
