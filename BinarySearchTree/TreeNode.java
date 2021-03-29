package BinarySearchTree;

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
        this.setVal(val);
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.setVal(val);
        this.setLeft(left);
        this.setRight(right);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
