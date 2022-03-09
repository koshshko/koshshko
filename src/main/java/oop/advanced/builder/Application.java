package oop.advanced.builder;

public class Application {

    public static void main(String[] args) {
        Triangle t = new TriangleBuilder()
                .setA(1)
                .setB(2)
                .setC(3)
                .setH(4)
                .setColor("green")
                .build();

        System.out.println(t.getPerimeter());

        Triangle abT = TriangleDirector.getIsoscelesTriangle(1);
        Triangle abcT = TriangleDirector.getEquilateralTriangle(2);
        Triangle blackTriangle = TriangleDirector.getBlackTriangle();

        System.out.println(abT.getPerimeter());
        System.out.println(abcT.getPerimeter());
        System.out.println(blackTriangle.getColor());
    }
}