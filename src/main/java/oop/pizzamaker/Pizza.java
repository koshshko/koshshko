package oop.pizzamaker;

import java.util.HashMap;

/*
Написать класс пицца-мейкера. Клиент приходит в ресторан и заказывает пиццу
определенного типа. На экран выводится пошаговый рецепт ее приготовления, например:
1. Взять основу 30 см
2. Намазать томатный соус
3. Уложить помидоры
4. Посыпать сыром
5. Выпекать в духовке 15 минут при температуре 220 градусов
Реализовать билдер, чтобы клиент имел возможность собрать “кастомную” пиццу
самостоятельно.
Предусмотреть возможность добавлять доп. ингридиенты в существующие стандартные пиццы
 */
public class Pizza {

    private int diameter; // 30, 40, 45
    HashMap<String, Integer> ingridients = new HashMap<>();

    public void printRecipe() {
        int counter = 1;
        System.out.println(counter + ". Взять основу " + diameter + " см");

        for (String key : ingridients.keySet()) {
            if (ingridients.get(key) == 1) {
                counter++;
                System.out.println(counter + ". Добавить " + key + " соус");
            }
        }

        for (String key : ingridients.keySet()) {
            if (ingridients.get(key) == 2) {
                counter++;
                System.out.println(counter + ". Добавить " + key);
            }
        }

        counter++;
        System.out.println(counter + ". Выпекать в духовке 15 минут при температуре 220 градусов");
    }

    public void addIngridient(String name, int priority) {
        ingridients.put(name, priority);
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}