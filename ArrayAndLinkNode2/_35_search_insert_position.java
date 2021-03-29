package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-21 16:37
 */
public class _35_search_insert_position {

    public int searchInsert(int[] nums, int target) {
        for (int i = (nums.length - 1); i >= 0; i--) {
            if (nums[i] < target) {
                return i + 1;
            } else if (nums[0] > target) {
                return 0;
            } else if (nums[i] == target || nums[i] > target && nums[i - 1] < target) {
                return i;
            }
        }
        return 0;
    }

    //    优雅的代码。
    public int searchInsert2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
//   还可以二分查找

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(new _35_search_insert_position().searchInsert(nums, 5));
    }


}
