package oop.advanced.singleton;

import oop.advanced.inheritance.Rectangle;

public class WebDriver2 {

    private static Rectangle rectangle;

    // Инициализация при обращении
    public static void init() {
        if (rectangle == null) {
            rectangle = new Rectangle(10, 20, 4, "green");
        }
    }

    // Использование ранее инициализированного объекта
    public static double getSquare() {
        return rectangle.getSquare();
    }
}