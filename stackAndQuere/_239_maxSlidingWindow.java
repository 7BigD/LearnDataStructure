package stackAndQuere;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _239_maxSlidingWindow {

    private PriorityQueue<Integer> queue;

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        queue = new PriorityQueue(k);
        for (int i = 0; i < len; i++) {
            queue.add(nums[i]);
        }

        int[] max = new int[]{};

        return null;
    }


}
