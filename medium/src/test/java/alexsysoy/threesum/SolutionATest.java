package alexsysoy.threesum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    @Test
    void threeSum() {
        Solution solution = new SolutionA();
        System.out.println(solution.threeSum(new int[]{-2,0,0,2,2}));
    }
}