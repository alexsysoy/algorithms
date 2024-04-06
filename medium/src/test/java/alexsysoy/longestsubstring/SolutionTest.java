package alexsysoy.longestsubstring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @ParameterizedTest
    @CsvSource({
            "abcabcbb,3",
            "bbbbb,1",
            "pwwkew,3",
            "a,1",
            "'',0",
            "qqqqqffg,2",
            "qqffqfgqf,3",
            "au,2",
            "dvsdta,5",
            "dvdf,3"
    })
    void lengthOfLongestSubstringA(String s, int result) {
        solution = new SolutionA();
        assertEquals(result, solution.lengthOfLongestSubstring(s));
    }

    @ParameterizedTest
    @CsvSource({
            "abcabcbb,3",
            "bbbbb,1",
            "pwwkew,3",
            "a,1",
            "'',0",
            "qqqqqffg,2",
            "qqffqfgqf,3",
            "au,2",
            "dvsdta,5",
            "dvdf,3"
    })
    void lengthOfLongestSubstringB(String s, int result) {
        solution = new SolutionB();
        assertEquals(result, solution.lengthOfLongestSubstring(s));
    }
}