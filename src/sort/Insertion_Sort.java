package sort;

import java.util.Arrays;

public class Insertion_Sort {
    // 从小排大
    void Insertion_Sort(int[] nums, int n) {
        for (int p = 1; p < n; p++) {
            int tmp = nums[p]; // 当前要插入的
            int i = p - 1;
            while (i >= 0 && nums[i] > tmp) {
                nums[i + 1] = nums[i];
                i--;
            }
            nums[i + 1] = tmp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Insertion_Sort insertion_sort = new Insertion_Sort();
        int[] nums = new int[]{5, 3, 6, 2};
        insertion_sort.Insertion_Sort(nums, 4);

    }
}
