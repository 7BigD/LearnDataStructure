package BinarySearchTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author BigD
 * @Create 2021-03-18 13:30
 */
public class _144_binary_tree_preorder_traversal {
    LinkedList<Integer> list = new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        help(root);
        return list;
    }

    void help(TreeNode root) {
        if (root != null) {
            help(root.getLeft());
            help(root.getRight());
            list.add(root.getVal());
        }
    }


    public List<Integer> preorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                list.add(cur.getVal());
                cur = cur.getLeft();
            }
            cur = stack.pop();
            cur = cur.getRight();
        }
        return list;
    }
}
