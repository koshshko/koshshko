package oop.advanced.polymorph;

public class Triangle extends Shape {

    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getSquare() {
        return 0.5 * c * h;
    }

    public double getPerimeter() {
        return a + b + c;
    }
}
