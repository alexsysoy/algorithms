package alexsysoy.maxconsecutiveones;

import alexsysoy.Massive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    @ParameterizedTest
    @CsvSource(value = {
            "1,1,0,1,1,1;3",
            "1,0,1,1,0,1;2",
            ";0",
            "1;1",
            "0;0",
            "0,1,0,1,0,1,0,1,0;1"
    }, delimiter = ';')
    void SolutionA(String massive, int expected) {
        Solution solution = new SolutionA();
        int[] data = Massive.getIntMassive(massive);

        Assertions.assertEquals(expected, solution.findMaxConsecutiveOnes(data));
    }
}