package oop.pizzamaker;

public class PizzaBuilder {

    private Pizza pizza = new Pizza();

    public PizzaBuilder setDiameter(int diameter) {
        pizza.setDiameter(diameter);
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        pizza.addIngridient(sauce, 1);
        return this;
    }

    public PizzaBuilder setCheese(String cheese) {
        pizza.addIngridient(cheese, 2);
        return this;
    }

    public PizzaBuilder setTomato(String tomato) {
        pizza.addIngridient(tomato, 2);
        return this;
    }

    public PizzaBuilder setMushroom(String mushroom) {
        pizza.addIngridient(mushroom, 2);
        return this;
    }

    public PizzaBuilder setPineapple(boolean pineapple) {
        pizza.addIngridient("ананас", 2);
        return this;
    }

    public PizzaBuilder setSausage(String sausage) {
        pizza.addIngridient(sausage, 2);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}