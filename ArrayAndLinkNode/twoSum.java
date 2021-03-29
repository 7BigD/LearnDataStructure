import java.lang.reflect.Array;

public class twoSum {

    public int[] two_Sum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i =0; i<nums.length; i++) {
            for (int j = i + 1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }

        return a;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        nums =  new twoSum().two_Sum(nums,6);
        System.out.println(nums[0]+" "+nums[1]);
    }

}
