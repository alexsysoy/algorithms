package alexsysoy.searchinrotatedsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    @Test
    void search() {
        Solution solution = new SolutionA();
        System.out.println(solution.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}