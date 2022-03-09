package oop.advanced.builder;

public class TriangleDirector {

    public static Triangle getIsoscelesTriangle(int measure) {
        return new TriangleBuilder()
                .setA(measure)
                .setB(measure)
                .setC(5)
                .setH(4)
                .build();
    }

    public static Triangle getEquilateralTriangle(int measure) {
        return new TriangleBuilder()
                .setA(measure)
                .setB(measure)
                .setC(measure)
                .setH(4)
                .build();
    }

    public static Triangle getBlackTriangle() {
        return new TriangleBuilder()
                .setA(3)
                .setB(4)
                .setC(5)
                .setH(4)
                .setColor("black")
                .build();
    }
}
