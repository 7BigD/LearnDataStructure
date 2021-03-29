import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
1. loop count zeros,
2. 开 新数组
3. index
if (nums == null || nums.length == 0) {
            return;
        }
        int slow = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[slow++] = nums[i];
            }
        }
        for (int i = slow; i<nums.length; i++) {
            nums[i] = 0;
        }
 */
public class MoveZero {

    public static void moveZeroes(int[] nums) {

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] nums = new int[5];
//        for (int i = 0; i<5; i++) {
//            nums[i] = scanner.nextInt();
//        }
//        moveZeroes(nums);
//
//        System.out.println(Arrays.toString(nums));

        int i = 1;
        int j = 3;
        int[] a = new int[]{4,3,2,1};
        int min = Math.min(a[i++],a[j--]);
        System.out.println(min);
        System.out.println("i: " + i);
        System.out.println("j: " + j);


    }


}
