package basics;

import oop.basics.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTests {

    /*
    1. Сказать джаве, что мы запускаем этот метод как тестовый метод
    2. Мы должны сделать что-то
    3. Проверить результат
     */
    @Test
    void simpleTest() {
        Car car = new Car();
        car.color = "green";

        assertEquals("green1", car.color);
    }
}
