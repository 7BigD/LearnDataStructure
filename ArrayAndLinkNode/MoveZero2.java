import java.util.Scanner;

/**
 * 双指针
 */
public class MoveZero2 {

    public static void moveZeroes(int[] nums) {
        int j=0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i<nums.length; i++) {
            nums[i] = 0;
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i<5; i++) {
            nums[i] = scanner.nextInt();
        }
        moveZeroes(nums);

    }

}
