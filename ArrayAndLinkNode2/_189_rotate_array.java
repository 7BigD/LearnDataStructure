package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-22 18:27
 */
public class _189_rotate_array {
    public void totate(int[] nums, int k) {
        k = k%nums.length;
        int[] ns = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ns[i] = nums[(i + k) % nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ns[i];
        }
    }
}
