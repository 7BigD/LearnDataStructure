package ArrayAndLinkNode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class _66_plus_one {
    public int[] plusOne(int[] digits) {
        int i = 1;
        while (i<=digits.length) {
            if ((digits[digits.length - i] + 1) == 10) {

                digits[digits.length - i++] = 0;

            }else {
                digits[digits.length - i] = digits[digits.length - i] + 1;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
//        if (i == digits.length+1) {
//            int[] digits2 = new int[digits.length + 1];
//            digits2[0] = 1;
//            for (i = 0; i < digits.length; i++) {
//                digits2[i + 1] = digits[i];
//            }
////            System.out.println(Arrays.toString(digits2));
//            return digits2;
//        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9};
        System.out.println(Arrays.toString(new _66_plus_one().plusOne(digits)));
    }



}
