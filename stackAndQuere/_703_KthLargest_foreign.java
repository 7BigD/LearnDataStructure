package stackAndQuere;

import java.util.PriorityQueue;

 class _703_KthLargest_foreign {
    final PriorityQueue<Integer> q;
    final int k;

    public _703_KthLargest_foreign(int k, int[] nums) {
        this.k = k;
        this.q = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }

    }

     public int add(int var) {
         if (q.size() < k) {
             q.add(var);
         } else {
             if (q.peek() < var) {
                 q.poll();
                 q.add(var);
             }
         }
        return q.peek();
     }

     public static void main(String[] args) {
         int[] nums = new int[]{3,5,8,2};
         _703_KthLargest_foreign kthLargest = new _703_KthLargest_foreign(3, nums);
         kthLargest.add(3);   // return 4
         kthLargest.add(5);   // return 5
         kthLargest.add(10);  // return 5
         kthLargest.add(9);   // return 8
         System.out.println(kthLargest.add(4));   // return 8

//         来源：力扣（LeetCode）
//         链接：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream
//         著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     }
}
