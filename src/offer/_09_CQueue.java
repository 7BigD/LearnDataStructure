package offer;

import java.util.Stack;

public class _09_CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public _09_CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }
        return stack2.pop();

    }
}
