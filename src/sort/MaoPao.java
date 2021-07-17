package sort;

public class MaoPao {

    public void mao_pao_sort(int[] nums, int n) {
        for (int p = n - 1; p > 0; p--) {

            for (int i = 0; i < p; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums[i], nums[i + 1]);
                }
            }
        }
    }

    private void swap(int a, int b) {

    }

    public static void main(String[] args) {


    }
}
