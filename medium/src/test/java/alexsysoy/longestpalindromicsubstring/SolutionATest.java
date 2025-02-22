package alexsysoy.longestpalindromicsubstring;

import org.junit.jupiter.api.Test;

class SolutionATest {

    @Test
    void longestPalindrome() {
        SolutionA solutionA = new SolutionA();
        String string = solutionA.longestPalindrome("bb");
        System.out.println(string);
    }
}