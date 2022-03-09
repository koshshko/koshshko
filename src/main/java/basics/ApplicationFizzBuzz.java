package basics;

public class ApplicationFizzBuzz {

    /*
    0 -> FizzBuzz
    1 -> ""
    3 -> Fizz
    27 -> Fizz
    5 -> Buzz
    25 -> Buzz
    15 -> FizzBuzz
    30 -> FizzBuzz
    */
    public static void main(String[] args) {
        fizzBuzz(0);
        fizzBuzz(1);
        fizzBuzz(3);
        fizzBuzz(27);
        fizzBuzz(5);
        fizzBuzz(25);
        fizzBuzz(15);
        fizzBuzz(30);
        fizzBuzz(-1);
        fizzBuzz(-3);
        fizzBuzz(-27);
        fizzBuzz(-5);
        fizzBuzz(-25);
        fizzBuzz(-15);
        fizzBuzz(-30);
    }

    static void fizzBuzz(int a) {
        System.out.print(a + " -> ");
        if (a % 3 == 0) System.out.print("Fizz");
        if (a % 5 == 0) System.out.print("Buzz");

        System.out.println();
    }
}
