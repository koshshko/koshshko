package oop.advanced.abstraction;

import oop.advanced.inheritance.Squire;

public class Abstraction {

    // Пример абстракции
    public static void main(String[] args) {
        // Shape r = new Shape(4, "green"); -> не сработает, нельзя инициализировать
        // экземпляр абстрактного класса
        Squire r = new Squire(5, 4, "blue");
        System.out.println(r.getPerimeter());
    }
}
