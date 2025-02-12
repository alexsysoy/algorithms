package alexsysoy.maxconsecutiveones;

import alexsysoy.Massive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "1,1,0,1,1,1;3",
            ""
    })
    void testA(String rawNums, int expected) {
        int[] nums = Massive.getIntMassive(rawNums);
        Solution solution = new SolutionA();

        Assertions.assertEquals(expected, solution.findMaxConsecutiveOnes(nums));
    }
}