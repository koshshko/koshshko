package oop.pizzamaker;

public class PizzaDirector {

    public static Pizza getMargarita(int diameter) {
        return new PizzaBuilder()
                .setSauce("томатный")
                .setTomato("помидоры")
                .setCheese("моцарела")
                .setDiameter(diameter)
                .build();
    }

    public static Pizza getHavaii(int diameter) {
        return new PizzaBuilder()
                .setSauce("сливочный")
                .setTomato("черри")
                .setCheese("моцарела")
                .setDiameter(diameter)
                .setPineapple(true)
                .build();
    }
}
