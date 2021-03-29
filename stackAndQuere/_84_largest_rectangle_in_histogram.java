package stackAndQuere;


//# 暴力求解1
//for i -> 0 , n - 2
//    for j -> j+1, n - 1
//        (i-j) 最小高度 area
//        更新man值

//# 暴力求解2
//左右两端

//#stack


    /*  暴力求解1
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length ; i++) {
            for (int j = i ; j < heights.length; j++) {
//                1. 找到（j-i）中最小的.
                int min = heights[i];
                for (int k = i; k <= j; k++) { min = Math.min(min, heights[k]); }
//                2. min * （j-i）
                max = Math.max(max, min * (j - i+1));
            }
        }

        return max;
    }
*/

//    暴力 求解二：

    //            for (int left_point = i, right_point = i; left_point >= 0 && right_point < heights.length; ) {
//                if (heights[left_point] >= heights[i]) {
//                    left_point--;
//                }
//                if (heights[right_point] >= heights[i]) {
//                    right_point++;
//                }
//
//            }
//            转换思路，两个循环， 一个求左， 一个求右边。

/*

    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int left_point = i;
            while (left_point >= 0 && heights[left_point] >= heights[i]) {
                left_point--;
            }
            int right_point = i;
            while (right_point < heights.length && heights[i] <= heights[right_point]) {
                right_point++;
            }

            int tempArea = (right_point - left_point - 1) * heights[i];
            maxArea = Math.max(tempArea, maxArea);
        }

        return  maxArea;
    }
 */



////////////////////////////解法三  用stack

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class _84_largest_rectangle_in_histogram {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int area = 0;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return heights[0];
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {

//            这个while 就是 当 我现在的 元素  比  stack 的栈顶 元素要小 那么久 弹出栈，，，但是  还有可能不止一个
//            比我现在这个元素小。。那么就需要用while  把他们都弹出栈。并且，这个过程去计算，Area
            while (!stack.isEmpty() && heights[stack.peekLast()] > heights[i]) {
                /*
                开始了
                 */
                int height = heights[stack.removeLast()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peekLast() - 1;
                }
                area = Math.max(area, width * height);
            }
            stack.addLast(i);
        }

        while (!stack.isEmpty()) {

            int height = heights[stack.removeLast()];
            int width;
            if (stack.isEmpty()) {
                width = len;
            }else {
                width = len - stack.peekLast() - 1;
            }
            area = Math.max(area, width * height);

        }
        return  area ;

    }

    //    使用stack  并且采用   哨兵
    public int largestRectangleArea2(int[] heights) {
        int len = heights.length;
        int Area = 0;

        int[] newHeights = new int[len + 2];
        newHeights[0] = 0;
        newHeights[len+1] = 0;

        System.arraycopy(heights, 0, newHeights, 1, len);
        len += 2;

        heights = newHeights;
        Deque<Integer> stack = new ArrayDeque<>(len);

        stack.addLast(0);

        for (int i = 1; i < len; i++) {

            while (heights[stack.peekLast()] > heights[i]) {
                int height = heights[stack.removeLast()];
                int width = i - stack.peekLast() - 1;
                Area = Math.max(Area, height * width);

            }
            stack.addLast(i);
        }
        return Area;
    }


    public static void main(String[] args) {

        int[] heights = new int[]{2,1,5,6,6,2,3};
        System.out.println(new _84_largest_rectangle_in_histogram().largestRectangleArea2(heights));
    }

}
