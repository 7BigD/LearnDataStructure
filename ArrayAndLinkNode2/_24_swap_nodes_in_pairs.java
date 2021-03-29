package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-22 16:23
 */
public class _24_swap_nodes_in_pairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            second.next = first;
            cur.next = second;
            cur = cur.next.next;
        }
        return dummy.next;
    }

}
