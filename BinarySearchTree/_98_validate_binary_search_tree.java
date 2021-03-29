package BinarySearchTree;

/**
 * @author BigD
 * @Create 2021-03-18 20:23
 */

public class _98_validate_binary_search_tree {
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
        return helpl(cur);

    }

//    错误，当只有左子树是二叉搜索树的时候，直接返回 true ，应该。&& 右子树
    public boolean helpl(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.getLeft() != null && root.getVal() > root.getLeft().getVal()) {
            return helpl(root.getLeft())&&helpr(root.getRight());
        } /*else if (root.right != null && root.val < root.right.val) {
            return help(root.right);*/
        else {
            return false;
        }
    }

    public boolean helpr(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.getRight() != null && root.getVal() < root.getRight().getVal()) {
            return helpr(root.getRight())&&helpl(root.getLeft());
        } else {
            return false;
        }
    }

}
