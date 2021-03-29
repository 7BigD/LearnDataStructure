package stackAndQuere;

import java.util.Stack;

public class _155_min_stack {
    /**
     * initialize your data structure here.
     */
    Stack<Integer> dataStack;
    Stack<Integer> minStack;

    public _155_min_stack() {
         dataStack = new Stack();
         minStack = new Stack();
    }

    public void push(int x) {
        dataStack.push(x);
//        if (minStack.isEmpty() || x <= minStack.peek()  ) {
//            minStack.push(x);
//        }
        if (!minStack.isEmpty()) {
            minStack.push(Math.min(minStack.peek(), x));
        }else {
            minStack.push(x);
        }
    }

    public void pop() {
        minStack.pop();
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        _155_min_stack minStack = new _155_min_stack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();

//        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }
}
