package ArrayAndLinkNode;

import java.util.Arrays;
import java.util.HashMap;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int length=0;
        if (nums==null){
            return length;
        }else {
            length++;
        }
        int j = 1;
        int i = 1;
        while (i<nums.length) {
            if (nums[i] == nums[i-1]) {
                i++;
            }else {
                length++;
                nums[j++] = nums[i];
                i++;

            }
        }
        return length;

    }

    public int removeDuplicates2(int[] nums) {

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,0,0,1,1,2,3};
        System.out.println(new removeDuplicates().removeDuplicates(nums));
        System.out.println();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    }

}
