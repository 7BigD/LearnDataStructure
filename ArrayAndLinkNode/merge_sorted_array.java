import java.util.Arrays;

public class merge_sorted_array {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArr = new int[nums1.length];
        int k = 0;
        int i , j;
        for ( i = 0, j = 0; i<m&&j<n; ) {
            if (nums1[i] < nums2[j]) {
                newArr[k++] = nums1[i++];

            }else {
                newArr[k++] = nums2[j++];
            }
        }
        if (i < j) {
            for (; i < nums1.length; i++) {
                newArr[k++] = nums1[i];
            }
        }else {
            for (; j < nums2.length; j++) {
                newArr[k++] = nums2[j];
            }
        }
        for (int a = 0; a < nums1.length; a++) {
            nums1[a] = newArr[a];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3,  n = 3;
        new merge_sorted_array().merge(nums1,m,nums2,n);
    }

}
