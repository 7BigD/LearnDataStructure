package offer_Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _03_findRepeatNumber {


    public int findRepeatNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public int findRepeatNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
