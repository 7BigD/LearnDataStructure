package DynamicProgramming;

import javax.swing.plaf.metal.MetalTheme;

/**
 * @author BigD
 * @Create 2021-03-26 20:14
 */
public class _124_binary_tree_maximum_path_sum {

    //    from labuladong
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMax(root);
        return ans;
    }

    private int getMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, getMax(root.left));
        int right = Math.max(0, getMax(root.right));
        ans = Math.max(ans, right + left + root.val);
        return root.val + Math.max(right, left);
    }
}
