package alexsysoy.addtwonumbers;


import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }
        ListNode node = (ListNode) o;
        return (next == null && node.next == null && val == node.val) ||
                (next != null && node.next != null && val == node.val && next.equals(node.next));
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}

