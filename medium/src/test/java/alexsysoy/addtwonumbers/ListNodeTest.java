package alexsysoy.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void equalsA() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(2);

        assertEquals(l1, l2);
    }

    @Test
    void equalsB() {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);

        assertNotEquals(l1, l2);
    }

    @Test
    void equalsC() {
        ListNode l1 = new ListNode(2, new ListNode(4));
        ListNode l2 = new ListNode(2);

        assertNotEquals(l1, l2);
    }

    @Test
    void equalsD() {
        ListNode l1 = new ListNode(2, new ListNode(4));
        ListNode l2 = new ListNode(2, new ListNode(4));

        assertEquals(l1, l2);
    }

    @Test
    void equalsE() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        assertNotEquals(l1, l2);
    }
}