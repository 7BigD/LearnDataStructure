package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BigD
 * @Create 2021-03-27 09:11
 */
public class _22_generateParenthesis {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        _generate(0, 0, n, "");
        return list;
    }

    private void _generate(int left, int right, int max, String s) {
//        recursion terminator
        if (left == max && left == right) {
            list.add(s);
//            System.out.println(s);
            return;
        }
//        process login in current level
//        dill dowm
        if (left < max) {
            _generate(left + 1, right, max, s + '(');
        }
        if (right < left && right < max) {
            _generate(left, right + 1, max, s + ')');
        }
    }
    List<String> list1 = new ArrayList<>();
    public List<String> generateParenthesis2(int n) {

        _generate2(0, 0, n, "");
        return list1;
    }

    private void _generate2(int left, int right, int max, String s) {
        if (left == max && left == right) {
            list1.add(s);
            return;
        }
        if (left < max) {
            _generate2(left+1, right, max, s+'(');
        }
        if (right < left) {
            _generate2(left, right + 1, max, s + ')');
        }

    }


    public static void main(String[] args) {
        _22_generateParenthesis generateParenthesis = new _22_generateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis2(3));
    }
}
