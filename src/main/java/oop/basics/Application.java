package oop.basics;

public class Application {

    public static void main(String[] args) throws Exception {
        // int i = 0;
        Car vehicle = new Car();
        vehicle.color = "red";
        vehicle.setDriveType("front");
        vehicle.engineVolume = 1.6;

        // Проблема! Можно достучаться до любого объекта
        vehicle.setWheelRadius(16);
        vehicle.wheels[0].radius = 15;
        vehicle.printWheelRadiuses();

        System.out.println(vehicle.getCurrentPosition());
        vehicle.startEngine();
        vehicle.drive(60);
        System.out.println(vehicle.getCurrentPosition());
        vehicle.park("Параллельно");
        vehicle.stopEngine();
        System.out.println(vehicle.getCurrentPosition());
    }
}
