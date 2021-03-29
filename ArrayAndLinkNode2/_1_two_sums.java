package ArrayAndLinkNode2;

import java.util.HashMap;

/**
 * @author BigD
 * @Create 2021-03-20 11:25
 */
public class _1_two_sums {
//    1. 暴力求解。两个循环。
//    2. 哈希表。
    public int[] twosums1(int[] sum, int target) {
        int[] a = new int[2];
        int len = sum.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                if (sum[i] == target - sum[j]) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }

//    使用hashmap 去查找  target-x  这个复杂度是 O(1)
    public int[] twosum2(int[] sum, int target) {
        HashMap<Integer, Integer> maptable = new HashMap<>();
        int n = sum.length;
        for (int i = 0; i < n; i++) {
            if (maptable.containsKey(target - sum[i])) {
                return new int[]{maptable.get(target - sum[i]), i};
            }
            maptable.put(sum[i], i);
        }
        return null;
    }
}
