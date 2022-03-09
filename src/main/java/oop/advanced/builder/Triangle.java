package oop.advanced.builder;

public class Triangle {

    private int a;
    private int b;
    private int c;
    private int h;
    private String color;

    public Triangle() {}

    public double getSquare() {
        return 0.5 * c * h;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
