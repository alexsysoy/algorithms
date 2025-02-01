package alexsysoy.prefixfunction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static alexsysoy.Print.printArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FirstRealisationTest {

    @BeforeEach
    void setUp() {
    }

    @ParameterizedTest
    @CsvSource(value = {
            "abcabcd;0,0,0,1,2,3,0",
            "aataataa;0,1,0,1,2,3,4,5",
            "aaaaa;0,1,2,3,4",
            "abcdef;0,0,0,0,0,0",
            "abacabadava;0,0,1,0,1,2,3,0,1,0,1"



    }, delimiter = ';')
    void firstFunction(String input, String prefix) {
        PrefixFunction prefixFunction = new FirstRealisation();
        int[] expected = getExpected(prefix);

        int[] actual = prefixFunction.get(input);

        printArray(actual);
        printArray(expected);
        assertArrayEquals(expected, actual);
    }

    private int[] getExpected(String prefix) {
        String[] split = prefix.split(",");
        int[] result = new int[split.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }
}