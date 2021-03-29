package Recursion;
/**
 * @author BigD
 * @Create 2021-03-18 10:50
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
