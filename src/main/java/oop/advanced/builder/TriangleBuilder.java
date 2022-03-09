package oop.advanced.builder;

public class TriangleBuilder {

    Triangle triangle = new Triangle();

    public TriangleBuilder setA(int a) {
        triangle.setA(a);
        return this;
    }

    public TriangleBuilder setB(int b) {
        triangle.setB(b);
        return this;
    }

    public TriangleBuilder setC(int c) {
        triangle.setC(c);
        return this;
    }

    public TriangleBuilder setH(int h) {
        triangle.setH(h);
        return this;
    }

    public TriangleBuilder setColor(String color) {
        triangle.setColor(color);
        return this;
    }

    public Triangle build() {
        return triangle;
    }
}
