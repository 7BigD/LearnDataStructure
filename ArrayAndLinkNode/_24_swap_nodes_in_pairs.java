package ArrayAndLinkNode;

public class _24_swap_nodes_in_pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dommy = new ListNode(0);
        dommy.next = head;
        ListNode current = dommy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = current.next.next;
        }
        return dommy.next;

    }

    public static void main(String[] args) {
        ListNode head4 = new ListNode(4,null);
        ListNode head3 = new ListNode(3,head4);
        ListNode head2 = new ListNode(2,head3);
        ListNode head = new ListNode(1, head2);
//        head.next(head2);
        head = new _24_swap_nodes_in_pairs().swapPairs(head);
//        System.out.println(head);
        while (head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


    /* 失败的代码
    ListNode cur = head;
        ListNode Lnext = null;
        ListNode tmp = null;
        head = cur.next;
        while (cur != null) {
            Lnext = cur.next;
            cur.next = Lnext.next;
            Lnext.next = cur;

            tmp = cur.next;

            cur = cur.next;
            tmp.next = cur.next;
        }

        return head;
     */
}

