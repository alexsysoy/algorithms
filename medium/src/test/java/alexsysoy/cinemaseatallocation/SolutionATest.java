package alexsysoy.cinemaseatallocation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    @Test
    void maxNumberOfFamilies() {
        SolutionA solutionA = new SolutionA();

//        System.out.println(solutionA.maxNumberOfFamilies(3, new int[][]{{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}}));
        System.out.println(solutionA.maxNumberOfFamilies(4, new int[][]{{4,3},{1,4},{4,6},{1,7}}));
    }
}