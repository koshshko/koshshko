package basics;

import oop.basics.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsLifecycle extends BaseTest {

    @Test
    void simpleTest() {
        Car car = new Car();
        car.color = "green";

        assertEquals("green", car.color);
    }

    @Test
    void simpleTest2() {
        assertTrue(true);
    }
}
