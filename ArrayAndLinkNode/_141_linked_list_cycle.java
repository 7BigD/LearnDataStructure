package ArrayAndLinkNode;

public class _141_linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        int pos;
        ListNode cur = null;
        while (head.next != null) {
            cur = head.next;
            pos = -1;
            while (cur.next != null) {
                pos++;
                if (head.val == cur.val) {
                    return true;
                }
                cur = cur.next;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }


}
