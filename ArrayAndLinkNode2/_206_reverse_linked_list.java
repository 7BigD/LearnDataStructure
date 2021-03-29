package ArrayAndLinkNode2;

import javax.security.auth.kerberos.KerberosTicket;

/**
 * @author BigD
 * @Create 2021-03-22 15:30
 */

public class _206_reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
