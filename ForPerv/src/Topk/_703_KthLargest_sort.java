package Topk;

/*
设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。

请实现 KthLargest类：
KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。

 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class _703_KthLargest_sort {

    int k;
    int[] nums;

    public _703_KthLargest_sort(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }

    public int add(int val) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 7, 1, 8, 2, 9, 4, 7, 2, 6, 6};
        int k = 5;
        new _703_KthLargest_sort(k, nums).add(1);
    }
}
