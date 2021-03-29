package stackAndQueue2;

import java.util.Stack;

/**
 * @author BigD
 * @Create 2021-03-22 18:43
 */
public class _20_valid_parentheses {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (chars[i] == '{') {
                stack.add('}');
            } else if (chars[i] == '[') {
                stack.add(']');
            } else if (chars[i] == '(') {
                stack.add(')');
            } else if (!stack.isEmpty() && stack.pop() == chars[i]){
                    continue;
            } else { 
                return false;
            }
        }

        return stack.isEmpty();
    }
}
