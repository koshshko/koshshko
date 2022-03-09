package basics;

import java.util.Scanner;

public class ApplicationInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        boolean c = in.nextBoolean();
        String s = in.nextLine();

        in.close();

        System.out.println(a);
    }
}
