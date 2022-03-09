package oop.advanced.singleton;

import oop.advanced.inheritance.Rectangle;

public class WebDriver {

    private static Rectangle rectangle;

    // Инициализация при обращении
    public static Rectangle getInstance() {
        if (rectangle == null) {
            rectangle = new Rectangle(10, 20, 4, "green");
        }
        return rectangle;
    }
}