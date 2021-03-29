package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-21 19:01
 */
public class _27_remove_element {
//    双指针，爷那优雅的代码。
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
