package oop.basics;

public class Application5 {

    // Статика
    public static void main(String[] args) throws Exception {
        Car4 car1 = new Car4("brown");
        car1.drive(10);

        Car4 car2 = new Car4("brown");
        Car4 car3 = new Car4("brown");
        Car4 car4 = new Car4("brown");
        Car4 car5 = new Car4();
        Car4 car6 = new Car4("brown");
        Car4 car7 = new Car4("brown");
        Car4 car8 = new Car4("brown");
        Car4 car9 = new Car4("brown");

        System.out.println(Car4.getCount());
    }
}
