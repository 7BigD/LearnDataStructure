package stackAndQuere;

import java.util.Stack;

public class _232_implemen_queue_using_stacks {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public _232_implemen_queue_using_stacks() {
        stack1 = new Stack();
        stack2 = new Stack();
    }


    /**
     * Initialize your data structure here.
     */
//    public MyQueue() {
//
//    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }

    public static void main(String[] args) {
        _232_implemen_queue_using_stacks _232_implemen_queue_using_stacks = new _232_implemen_queue_using_stacks();
        _232_implemen_queue_using_stacks.push(1); // queue is: [1]
        _232_implemen_queue_using_stacks.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        _232_implemen_queue_using_stacks.peek(); // return 1
        _232_implemen_queue_using_stacks.pop(); // return 1, queue is [2]
        _232_implemen_queue_using_stacks.empty(); // return false


    }
}
