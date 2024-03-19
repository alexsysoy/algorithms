package alexsysoy.reverseinteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @ParameterizedTest
    @CsvSource(value = {
            "1235,5321",
            "123,321",
            "-123,-321",
            "120,21",
            "-2147483648,0",
            "1463847412,2147483641",
            "-2147483412,-2143847412",
            "1563847412,0",
    })
    void reverseAParametrizedTest(int input, int expected) {
        solution = new SolutionA();

        int actual = solution.reverse(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1235,5321",
            "123,321",
            "-123,-321",
            "120,21",
            "-2147483648,0",
            "1463847412,2147483641",
            "-2147483412,-2143847412",
            "1563847412,0",
    })
    void reverseBParametrizedTest(int input, int expected) {
        solution = new SolutionB();

        int actual = solution.reverse(input);

        assertEquals(expected, actual);
    }
}