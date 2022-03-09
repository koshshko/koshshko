package basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    static void globalSetup() {
        System.out.println("Я выполняюсь перед запуском всех тестов в классе TestsLifecycle");
    }

    @BeforeEach
    void localSetup() {
        System.out.println("Я выполняюсь перед запуском каждого теста в классе TestsLifecycle");
    }

    @AfterEach
    void localTeardown() {
        System.out.println("Я выполняюсь после запуска каждого теста в классе TestsLifecycle");
    }

    @AfterAll
    static void globalTeardown() {
        System.out.println("Я выполняюсь после запуска всех тестов в классе TestsLifecycle");
    }
}
