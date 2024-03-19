package alexsysoy.addtwonumbers;

/**
 * Runtime 1ms 100%
 * Memory 43.75 mb 98.95%
 */
class SolutionA implements Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tail = null;
        int sum;
        int extra = 0;

        while (l1 != null || l2 != null) {
            sum = extra;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum >= 10) {
                tail = new ListNode(sum - 10, tail);
                extra = 1;
            } else {
                tail = new ListNode(sum, tail);
                extra = 0;
            }
        }

        if (extra == 1) {
            tail = new ListNode(extra, tail);
        }

        ListNode previous = null;
        ListNode next;
        ListNode current = tail;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
