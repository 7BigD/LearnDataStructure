package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author BigD
 * @Create 2021-03-18 10:49
 */
public class _94_binary_tree_inorder_traversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        re(root);
        return list;
    }

    void re(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.getLeft());
            list.add(root.getVal());
            inorderTraversal(root.getRight());
        }
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // method 1: recursion
        helper(root, res);
        return res;
    }

    //helper function for method 1
    private void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.getLeft(), res);
            res.add(root.getVal());
            helper(root.getRight(), res);
        }
    }

    /*
    用stack模拟
     */
    public List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        // 极端情况，root 是null
        if (root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.getLeft();
            }
            cur = stack.pop();
            list.add(cur.getVal());
            cur = cur.getRight();
        }
        return list;

    }

    public static void main(String[] args) {
        _94_binary_tree_inorder_traversal binary_tree_inorder_traversal = new _94_binary_tree_inorder_traversal();
        TreeNode root = new TreeNode();
        System.out.println(binary_tree_inorder_traversal.inorderTraversal(root));

    }
}
