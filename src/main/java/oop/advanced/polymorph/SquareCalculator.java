package oop.advanced.polymorph;

public class SquareCalculator {

    private double squire;

    public SquareCalculator(Shape shape) {
        this.squire = shape.getSquare();
    }

    public double getSquire() {
        return squire;
    }
}
