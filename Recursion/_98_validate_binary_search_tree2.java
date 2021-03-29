package Recursion;

import sun.reflect.generics.tree.Tree;

/**
 * @author BigD
 * @Create 2021-03-27 20:23
 */

public class _98_validate_binary_search_tree2 {
    /*
    my think :
    1. if else  to  finish ,  if it's not fit then return false;   maybe we can use recursion
    2. use recursion get a ListArray and judge it's sequence;
    3.
     */
//  1.
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode cur = root;
        helpl(cur);
        return false;
    }

    private int helpl(TreeNode cur) {
        if (cur != null) {
            int left = helpl(cur.left);
            if (cur.val > left) {

            }
            int right = helpl(cur.right);

            helpl(cur.right);



        }
        return 0;
    }


    //    国外
    public boolean isValidBST2(TreeNode root) {
        boolean validBST2 = isValidBST2(root, Long.MAX_VALUE, Long.MIN_VALUE);
        return validBST2;
    }

    private boolean isValidBST2(TreeNode root, long maxValue, long minValue) {
        if (root == null) {
            return true;
        }
        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }
        return isValidBST2(root.left, root.val, minValue) && isValidBST2(root.right, maxValue, root.val);
    }

}
