package oop.advanced.inheritance;

public abstract class Shape {

    int cornersCount;
    String color;

    public Shape(int cornersCount, String color) {
        this.cornersCount = cornersCount;
        this.color = color;
    }

    public abstract double getSquare();
    public abstract double getPerimeter();

    public void addOneCorner() {
        cornersCount++;
    }
}
