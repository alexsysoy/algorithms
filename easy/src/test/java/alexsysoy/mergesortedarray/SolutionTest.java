package alexsysoy.mergesortedarray;

import alexsysoy.Massive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1,2,3,0,0,0;3;2,5,6;3;1,2,2,3,5,6",
            "1;1;;0;1",
            "0;0;1;1;1"
    }, delimiter = ';')
    void testA(String rawNums1, int m, String rawNums2, int n, String rawExpected) {
        Solution solution = new SolutionA();
        int[] nums1 = Massive.getIntMassive(rawNums1);
        int[] nums2 = Massive.getIntMassive(rawNums2);
        int[] expected = Massive.getIntMassive(rawExpected);

        solution.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expected, nums1);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1,2,3,0,0,0;3;2,5,6;3;1,2,2,3,5,6",
            "1;1;;0;1",
            "0;0;1;1;1"
    }, delimiter = ';')
    void testB(String rawNums1, int m, String rawNums2, int n, String rawExpected) {
        Solution solution = new SolutionB();
        int[] nums1 = Massive.getIntMassive(rawNums1);
        int[] nums2 = Massive.getIntMassive(rawNums2);
        int[] expected = Massive.getIntMassive(rawExpected);

        solution.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expected, nums1);
    }
}