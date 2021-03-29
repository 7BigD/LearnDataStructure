import java.util.Arrays;

public class rotate_array {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[(i+nums.length-k)%nums.length];
        }
//        nums = array;

        nums = Arrays.copyOf(array,nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        rotate_array array = new rotate_array();
        array.rotate(nums,1);
    }
}
