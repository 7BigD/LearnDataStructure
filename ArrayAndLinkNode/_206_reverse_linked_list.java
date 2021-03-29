package ArrayAndLinkNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *  *     ListNode next;
 *  *     ListNode() {}
 *  *     ListNode(int val) { this.val = val; }
 *  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class _206_reverse_linked_list {

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (head != null) {
            cur = head;
            head = head.next;
            cur.next = prev;
            prev = cur;
        }
        return prev;

    }



    public static void main(String[] args) {

    }







    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return  prev;
    }
}
