package MeiTuan._8_15;

import java.util.*;
class Main {
    public boolean check(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int it : nums) {
            if(set.contains(it) || it < 1 || it > nums.length) {
                return false;
            }
            set.add(it);
        }
        return true;
    }
}
public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main so = new Main();
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < nums.length; i++) {
                nums[i] = in.nextInt();
            }
            if(so.check(nums)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
