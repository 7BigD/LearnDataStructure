/*
1. 暴力求解
2. 双指针法

 */

import java.util.Arrays;

public class twoSum167 {

//    2.
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int s =  numbers[i] + numbers[j] - target;
//            System.out.println(s);
            if (s < 0 ) {
//                while (i<j && )
                i++;
//                System.out.println("i:" + i);
            }else if (s>0) {
                j--;
//                System.out.println("j:
            }else {
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4};
        nums =  new twoSum167().twoSum(nums,6);
        System.out.println(nums[0]+" "+nums[1]);
        System.out.println(Arrays.toString(nums));
    }
}
