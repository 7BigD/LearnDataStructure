package stackAndQuere;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Stack;

public class _20_valid_parentheses {

    /*
    采用老外的
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.empty();
    }

    //通过。采用栈。。。进行判断
    /*需要注意的地方
    1. 但只有）））]]]]}}}又括号，需要判断，stack是否为空。直接false
    2. {{{{这个情况
    3.
     */
    public static boolean isValid2(String s) {
        char[] c = s.toCharArray();
        System.out.println(s.length());
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case '{':
                case '[':
                case '(':
                    stack.push(c[i]);
                    break;
                case ')':
                    if (stack.size() == 0 || stack.pop() != '(') {
                        return false;
                    } else {
                        break;
                    }
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.size() == 0 || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
//        if (stack.empty()) {
//            return true;
//        }else {
//            return true;
//        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "([{}";
        System.out.println(isValid2(s));

    }
}
