package basics;

public class ApplicationWordsTask {
    /*
    Посчитать количество слов в строке
    */
    public static void main(String[] args) {
        System.out.println(countWords("Hello, world!")); // 2
        System.out.println(countWords("Hello,  world!")); // 2
        System.out.println(countWords("Hello ,  world!")); // 2
        System.out.println(countWords("Hello ,,,,,,  world!")); // 2
        System.out.println(countWords("      Hello,,,,,,test  world!")); // 3
    }

    private static int countWords(String s) {
        String[] symbolsToDelete = new String[] { ",", "!", "$", "#", "%" };
        String newS = s;
        for (String c : symbolsToDelete) {
            newS = newS.replace(c, " ");
        }
        String[] words = newS.split(" ");

        int count = 0;

        for(String word : words) {
            if (word.length() > 0) count++;
        }

        return count;
    }
}
