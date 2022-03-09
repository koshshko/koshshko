package oop.advanced.polymorph;

public abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getSquare();
    public abstract double getPerimeter();
}
