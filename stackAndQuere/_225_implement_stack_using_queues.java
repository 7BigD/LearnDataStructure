package stackAndQuere;

import java.util.LinkedList;
import java.util.Queue;

public class _225_implement_stack_using_queues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public _225_implement_stack_using_queues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        queue1.add(x);
    }

    public static void main(String[] args) {

    }
}
