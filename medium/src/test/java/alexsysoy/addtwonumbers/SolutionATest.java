package alexsysoy.addtwonumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionATest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new SolutionA();
    }

    @Test
    void addTwoNumbersA() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode actual = solution.addTwoNumbers(l1, l2);

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbersB() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode actual = solution.addTwoNumbers(l1, l2);

        ListNode expected = new ListNode(0);
        assertEquals(expected, actual);
    }    @Test
    void addTwoNumbersC() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode actual = solution.addTwoNumbers(l1, l2);

        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assertEquals(expected, actual);
    }
}