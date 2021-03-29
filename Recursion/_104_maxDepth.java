package Recursion;

/**
 * @author BigD
 * @Create 2021-03-27 14:50
 */
public class _104_maxDepth {

    public int maxDepth(TreeNode root) {
        int res = 1;
        return maxDepth(root, res);
    }


//    结束的考虑不一样。
    private int maxDepth(TreeNode root, int res) {
        int left = res, right = res;
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            left = maxDepth(root.left, res + 1);
        }
        if (root.right != null) {
            right = maxDepth(root.right, res + 1);
        }
        return Math.min(left, right);
    }

}
