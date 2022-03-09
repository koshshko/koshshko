package oop.advanced.polymorph;

public class Squire extends Shape {

    int a;

    public Squire(int a, String color) {
        super(color);
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
