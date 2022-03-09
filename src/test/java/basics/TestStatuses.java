package basics;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStatuses extends BaseTest {

    // Success
    // Failed
    // Aborted
    // Disabled

    @Test
    void success() {
        assertTrue(true);
    }

    @Test
    void failed() {
        assertTrue(false);
    }

    @Test
    void aborted() {
        AssertionsTest.throwException();
        assertTrue(true);
    }

    @Test
    @Disabled(value = "Нашли баг, но его пока не поправили")
    void disabled() {
        assertTrue(true);
    }
}
