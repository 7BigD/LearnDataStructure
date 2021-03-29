package Recursion;

import javax.swing.*;

/**
 * @author BigD
 * @Create 2021-03-27 14:28
 */
public class _226_invertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if ( root.left != null || root.right != null) {
            TreeNode cur = root.right;
            root.right = root.left;
            root.left = cur;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
        return root;
    }

    public static void main(String[] args) {

    }

}
