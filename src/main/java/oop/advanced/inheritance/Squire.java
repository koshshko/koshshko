package oop.advanced.inheritance;

public class Squire extends Shape {

    int a;

    public Squire(int a, int cornersCount, String color) {
        super(cornersCount, color);
        this.a = a;
    }

    @Override
    public double getSquare() {
        return a * a;
    }

    public double getPerimeter() {
        return a * 4;
    }
}
