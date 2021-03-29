package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-22 17:08
 */
public class _142_linked_list_cycle_ii {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null) {
            return head;
        }
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }


}
