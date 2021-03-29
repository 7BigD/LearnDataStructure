package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author BigD
 * @Create 2021-03-24 21:30
 */
public class _94_binary_tree_inorder_traversal2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
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
}
