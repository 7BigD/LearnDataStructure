package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-22 16:41
 */
public class _141_linked_list_cycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast ) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;

    }

}
