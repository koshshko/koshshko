package oop.advanced.singleton;

import oop.advanced.inheritance.Rectangle;

public class Application {

    public static void main(String[] args) {
        // Использование синглтона 1
        System.out.println(Config.adminLogin);
        System.out.println(Config.adminPassword);
        System.out.println(Config.baseUrl);
        System.out.println(Config.maxTime);

        // Использование синглтона 2
        Rectangle r = WebDriver.getInstance();
        System.out.println(r.getSquare());
        System.out.println(r.getPerimeter());

        // Использование синглтона 3
        WebDriver2.init();
        System.out.println(WebDriver2.getSquare());
    }
}
