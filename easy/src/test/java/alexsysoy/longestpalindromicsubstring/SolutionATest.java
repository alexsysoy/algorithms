package alexsysoy.longestpalindromicsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    @Test
    void longestPalindrome() {
        SolutionA solutionA = new SolutionA();
        String string = solutionA.longestPalindrome("bb");
        System.out.println(string);
    }
}