package stackAndQuere;

import java.util.PriorityQueue;
 class _703_KthLargest {
//    public KthLargest(int k, int[] nums) {
//
//    }

    final PriorityQueue<Integer> priorityQueue;
    final int k;
    public _703_KthLargest(int k, int[] nums) {
        this.k = k;
        this.priorityQueue = new PriorityQueue<>(k);
//        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.isEmpty() || i < k) {
                priorityQueue.add(nums[i]);
            }else {
                if (priorityQueue.peek() < nums[i]) {
                    priorityQueue.poll();
                    priorityQueue.add(nums[i]);
                }
            }
        }
    }


    public int add(int val) {

        if (priorityQueue.isEmpty() || priorityQueue.size() <  k) {
            priorityQueue.add(val);
        }else {
            if (priorityQueue.peek() < val) {
                priorityQueue.poll();
                priorityQueue.add(val);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{};
        _703_KthLargest kthLargest = new _703_KthLargest(1, nums);
        kthLargest.add(3);   // return 4
        kthLargest.add(5);   // return 5
        kthLargest.add(10);  // return 5
        kthLargest.add(9);   // return 8
        System.out.println(kthLargest.add(4));   // return 8


//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    }


}
