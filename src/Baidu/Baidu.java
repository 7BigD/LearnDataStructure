package Baidu;

/*
   输入一个单链表， 1 2 2 3， 去除重复元素，
   输出 1 3
   input : 3  3  3
   output: null

   solution:
   1. O(N) head 往后走，知道新的节点（没有重复，即下一个不是跟自己相同的）
 */

public class Baidu {

    public ListNode deleteDup(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode cur = head;
        ListNode result = new ListNode(); // 有个为空的head 待会往后挪。
        while (cur.next != null){
            int flag = 0;
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                flag = 1;
            }
            // cur.val != cur.next.val
            if (flag == 1) { // 是否要去掉当前的node 如果有重复。去掉当前的node
                cur = cur.next;
            }

            if (cur != null) {
                ListNode nowNode = new ListNode(cur.val);
                result.next = nowNode;
            }
        }
        result = result.next;
        return result;
    }
}
//        方法二
//        ListNode cur = head;
//        while (cur.next != null) {
//            if(cur.val == cur.next.val) {
//                cur = cur.next.next;
//            }else {
//            cur = cur.next; // 删掉当前重复的。那个数字。
//          }
//        }
//        return cur;