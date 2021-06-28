package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _06_reversePrint {

    /*
    1. 利用递归
    2. 利用stack 模拟
     */
    List<Integer> tmp = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    private void recur(ListNode node) {
        if (node == null) return;
        recur(node.next);
        tmp.add(node.val);
    }

    // 2. stack
    public int[] reversePrint2(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();
        ListNode now = head;
        while (now != null) {
            stack.addFirst(now.val);
            now = now.next;
        }
        int[] res = new int[stack.size()];
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            res[i] = stack.removeFirst();
        }
        return res;
    }


}
