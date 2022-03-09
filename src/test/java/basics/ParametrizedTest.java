package basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTest {

    /*
    1. один из параметров - null
    2. оба параметра - null
    3. два целых числа
    4. одно из чисел - максимальное интовое
    5. одно из чисел - отрицательное
     */
    public int sum (int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            return 0;
        }
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(ints = {2, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void parameterizedTest(int a) {
        assertEquals(a + 1, sum(a, 1));
    }

    @ParameterizedTest
    @MethodSource("methodInts")
    void parameterizedTest2(int a, int b, int result) {
        assertEquals(result, sum(a, b));
    }

    static Stream<Arguments> methodInts() {
        return Stream.of(
                Arguments.arguments(null, 1, 0),
                Arguments.arguments(null, null, 0),
                Arguments.arguments(2, 3, 5),
                Arguments.arguments(Integer.MAX_VALUE, 1, Integer.MIN_VALUE),
                Arguments.arguments(Integer.MIN_VALUE, 1, Integer.MIN_VALUE + 1)
        );
    }

    @ParameterizedTest
    @CsvSource({
           "2, 3, 5",
            "0, 0, 0"
    })
    void parameterizedTest3(int a, int b, int result) {
        assertEquals(result, sum(a, b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/values.csv", numLinesToSkip = 1)
    void parameterizedTest4(int a, int b, int result) {
        assertEquals(result, sum(a, b));
    }
}
