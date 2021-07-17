public class _61_rotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        ListNode now = head;
        int len = 0;
        while (now.next != null) {
            len++;
            now = now.next;
        }
        // get the now P and len;
        k = k%len;
        ListNode fast = head;
        ListNode slow = head;
        while (k!=0) {
            fast = fast.next;
            k--;
        }
        // get fast and slow

        while (fast != now) {
            fast = fast.next;
            slow = slow.next;
        }
        // run fast and slow
        fast.next = head;
        while (head.next != slow) {
            head = head.next;
        }
        // run head before slow
        head.next = null;
        head = slow;
        return head;
    }

    public ListNode rotateRight2(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        return null;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        new _61_rotateRight().rotateRight(head, 2);
    }
}
