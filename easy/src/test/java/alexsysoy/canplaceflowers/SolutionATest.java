package alexsysoy.canplaceflowers;

import alexsysoy.Massive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionATest {

    @ParameterizedTest
    @CsvSource(value = {
            "1,0,0,0,1;1;true",
            "1,0,0,0,1;2;false",
            "0,0,1,0,1;1;true",
            "0,1,1,0,0;1;true",
            "0,0,0,0;2;true",
            "0;0;true",
            "0;1;true",
            "1;0;true",
            "1;1;false",
            "0,0;0;true",
            "0,0;1;true",
            "1,0;0;true",
            "1,0;1;false",
            "1,1;0;true",
            "1,1;1;false"
    }, delimiter = ';')
    void testA(String rawMas, int n, boolean expected) {
        Solution solution = new SolutionA();

        Assertions.assertEquals(expected, solution.canPlaceFlowers(Massive.getIntMassive(rawMas), n));
    }
}