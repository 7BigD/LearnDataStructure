
public class _2_addTwoNumbers {
    // 思路
    /*
    1. 倒序，意味着我可以直接加。
    2. 方法一：（时间复杂度非常大） 从链表拿出来放到int 相加再放回去。
    3. 方法二： for 遍历一次。

     */
    /*
    我写的不好。
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode sum = new ListNode();
        ListNode curS = sum;
        while (cur1 != null && cur2 != null) {
            int val = cur1.val + cur2.val;
            ListNode sum1 = new ListNode(val);
            curS.next = sum1;
            cur1 = cur1.next;
            cur2 = cur2.next;
            curS = curS.next;
        }

        if (cur1 == null) {
            ListNode sum1 = new ListNode(cur2.val); // 可以直接缩空间
            curS.next = sum1;
            curS = curS.next;
        } else {
            ListNode sum1 = new ListNode(cur1.val); // 可以直接缩空间
            curS.next = sum1;
            curS = curS.next;
        }

        sum = sum.next;
        curS = sum;

        int in = 0;
        while (curS != null) {
            if (curS.val >= 10) {
                int a = curS.val / 10;
                if (in != 0) {
                    a += in;
                }
                curS.val = curS.val % 10;
                in = a;
            }
        }
        return null;
    }


//    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
//
//    }
}

