package oop.basics;

public class Application4 {

    public static void main(String[] args) throws Exception {
        Car3 car = new Car3("brown");

        System.out.println(car.getColor());
        car.printWheelRadiuses();
    }
}
