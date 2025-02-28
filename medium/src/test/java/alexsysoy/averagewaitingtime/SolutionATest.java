package alexsysoy.averagewaitingtime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    @Test
    void averageWaitingTime() {
//        int[][] array = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        int[][] array = {{1,2},{2,5},{4,3}};
        SolutionA solution = new SolutionA();

        double v = solution.averageWaitingTime(array);

        System.out.println(v);
    }
}