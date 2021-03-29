package ArrayAndLinkNode2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author BigD
 * @Create 2021-03-21 11:28
 */
public class _15_3sum {

    /*
    1. 三重循环。暴力解法。 O(N^3)
        a.去重
            1. 排序。去重
        b.先排序
    2. 或许可以 hashmap  O(N^2)
    3. 双指针法。
        a.固定一个指针，另外两个指针去move

     */
//    1.
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        int n = nums.length;

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(tmp);
//                        对数组进行排序
//                        lists.add(tmp);
//                        接着去重
                        if (!set.contains(tmp.toString())) {
                            set.add(tmp.toString());
                            lists.add(tmp);
                        }
//                        也可以把Lists  设置成set 可以去重复。
//                        return 的时候 用 new ArrayList<>(set)

                    }
                }
            }
        }
        return lists;
    }

//    暴力优化
//    先快排。再暴力。求得之后是  单个数字不需要再排序。

    public List<List<Integer>> threeSum2(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums); // O(nlogn)

        // O(n^3)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return new ArrayList<>(res);
    }
/*
    作者：tangweiqun
    链接：https://leetcode-cn.com/problems/3sum/solution/suan-fa-si-wei-yang-cheng-ji-er-fen-cha-5bk43/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/

//    采用双指针法
    public List<List<Integer>> threeSum3(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            /*for (int j = 0, k = num.length - 1; ; ) {

            }*/
            if (nums[i] > 0) {
                break;
            }
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1, right = nums.length - 1, target = 0 - nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left+1])  left++;
                        while (left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < target) {
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                    } else {
                        while (left < right && nums[right] == nums[right-1]) right--;
                        right--;
                    }
                }

            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(new _15_3sum().threeSum3(nums));
    }
}
