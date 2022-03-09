package oop.basics;

public class Application2 {

    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 2;
        sum(a, b);
        System.out.println("main a = " + a);
        System.out.println("main b = " + b);

        Car vehicle = new Car();
        initializeCar(vehicle);
        System.out.println("Цвет машины = " + vehicle.color);
    }

    static void sum(int a, int b) {
        a = a + b;
        System.out.println("function a = " + a);
        System.out.println("function b = " + b);
    }

    static void initializeCar(Car car) throws Exception {
        car.color = "red";
        car.setDriveType("front");
        car.engineVolume = 1.6;

        car.setWheelRadius(16);
        car.wheels[0].radius = 15;
    }
}
