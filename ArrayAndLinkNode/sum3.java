import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && i != j && j!=k) {
                        List<Integer> list1 = null;
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        list.add(list1);
                    }
                }
            }
        }
        return list;
    }
    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
//        排序
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> res = new ArrayList<>();

        for (int k = 0; k<nums.length-2; k++) {
            if (nums[k] >= 0) {
                return res;
            }
            if (k>0 && nums[k] == nums[k-1]) {
                continue;
            }
            for (int i = k + 1, j = nums.length-1; i < j; ) {

                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
//                    while (i<j && nums[i] == nums[i+1]) {
////                        i++;
////                        System.out.println("i:" + i);
//                    }
                    while (i<j){
                        while (nums[i] == nums[i+1]) {
                            i++;
                        }
                    }
                    System.out.println("i: "+i);
                }
                if (sum > 0) { while (i<j && nums[j] == nums[j-1]) j--;

                }

                if (sum == 0) {
//                    new ArrayList<Integer>().add(nums[k])
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i<j && nums[i] == nums[++i]);
                    while (i<j && nums[j] == nums[--j]);
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        System.out.println(new sum3().threeSum2(nums));

    }
}
