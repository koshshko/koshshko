package oop.pizzamaker;

public class Application {

    public static void main(String[] args) {
        Pizza pizza = PizzaDirector.getHavaii(40);

        pizza.printRecipe();

        Pizza custom = new PizzaBuilder()
                .setTomato("помидоры")
                .setCheese("пармезан")
                .setDiameter(50)
                .build();

        custom.printRecipe();
    }
}
