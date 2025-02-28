package alexsysoy.shiftingletters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    @Test
    void shiftingLetters() {
        Solution solutionA = new SolutionA();
        System.out.println(solutionA.shiftingLetters("bad", new int[]{10,20,30}));
    }
}