package basics;

import oop.basics.practice2.Pistol;
import org.apache.commons.exec.util.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionsTest {

    @Test
    void simpleTest() {
        boolean f = false;
        String s = "test";

        assertTrue(true, "Ожидали переменную типа boolean = true");
        assertFalse(f, "Ожидали переменную типа boolean = false");
        assertEquals("test", s, "Ожидали строку со значением test");
        assertEquals(1, 1.0);
    }

    @Test
    void testExceptions() {
        // Ожидаем, что метод throwException класса AssertionsTest выкинет исключение
        assertThrows(RuntimeException.class, AssertionsTest::throwException);
    }

    // Пример использования
    @Test
    void WhenPistolIsBlockedAndShootShouldReturnRuntimeException() {
        Pistol p = new Pistol();
        p.setLocked(true);
        assertThrows(RuntimeException.class, p::shot);
    }

    @Test
    void stringsAssertion() {
        String s = "test";
        String s1 = "Test";

        assertEquals("test", s); // Проверить, что строки идентичны
        assertTrue(s.indexOf("es") != -1); // Проверить, что строка содержит подстроку
        assertEquals(1, s.indexOf("es")); // Проверить, что подстрока начинается с нужного индекса
        assertEquals("test", s1.toLowerCase()); // Проверить, что строки равны без учета регистра
    }

    public static void throwException() {
        throw new RuntimeException("You'll never pass!");
    }
}
