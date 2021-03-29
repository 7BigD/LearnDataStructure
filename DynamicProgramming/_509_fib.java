package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author BigD
 * @Create 2021-03-26 19:53
 */
public class _509_fib {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


    public int fib2(ArrayList<Integer> memo, int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo.get(n) != 0) {
            return memo.get(n);
        }
        memo.add(n, fib2(memo, n - 1) + fib2(memo, n - 2));
        return memo.get(n);
    }

    public int fib3(int n) {
        if (n == 0) return 0;
        if (n==1||n==2) return 1;
        int[] ary = new int[n + 1];
        ary[0] = 0;
        ary[1] = 1;
        ary[2] = 1;
        for (int i = 3; i <= n; i++) {
            ary[i] = ary[i - 1] + ary[i - 2];
        }
        return ary[n];
    }
}
