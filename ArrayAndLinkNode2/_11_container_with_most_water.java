package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-22 10:32
 */

/*
    脑袋空空的。。来吧
    求Area  =   （j-i）  *   high  底*高
    1. 暴力解法。
    2. 左右两边两个指针。
        a. 两个指针向内移动，如果，
            low柱子向内移动，则，有可能面积增大，（j-i）底变小， 但high可能变大。再比较Area。
            high柱子向内移动，则，一定变小 high不变（甚至更小），底一定变小。
    让我们来写代码吧
 */
public class _11_container_with_most_water {

    public int maxArea(int[] height) {
        int Area = 0;

        for (int i = 0, j = height.length - 1; i < j; ) {

            int high = Math.min(height[i], height[j]);
            Area = Math.max(Area, high * (j - i + 1));
            if (height[i] < height[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Area;
    }

}
