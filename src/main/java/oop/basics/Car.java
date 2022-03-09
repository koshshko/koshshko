package oop.basics;

public class Car {

    public String color;
    protected String name;
    int seatsCount;
    String type;
    double engineVolume;
    int wheelsCount;
    private String driveType;
    boolean hasForkop;
    Wheel[] wheels = new Wheel[4];
    int position = 0;

    void startEngine() {
        System.out.println("Машина заведена...");
    }

    void stopEngine() {
        System.out.println("Машина выключена...");
    }

    void drive(int velocity) {
        position = position + velocity;
        System.out.println("Машина едет");
    }

    void park(String type) {
        position = 0;

        if (type.equals("Параллельно")) {
            System.out.println("Машина припаркована параллельно!");
        } else {
            System.out.println("Машина припаркована перпендикулярно!");
        }
    }

    void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    int getCurrentPosition() {
        return position;
    }

    void setWheelRadius(int radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Радиус должен быть больше 0");
        }

        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
            wheels[i].radius = radius;
        }
    }

    void printWheelRadiuses() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Радиус колеса №" + i + " = " + wheels[i - 1].getRadius());
        }
    }
}
