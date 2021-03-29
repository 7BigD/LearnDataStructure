package ArrayAndLinkNode2;

/**
 * @author BigD
 * @Create 2021-03-22 11:14
 */
public class _70_climbing_stairs {
    public int climbStairs(int n) {
        int f1 = 1;
        int f2 = 2;
        int f3 = f2 + f1;
        if (n == 1) {
            return f1;
        }
        if (n == 2) {
            return f2;
        }
        for (int i = 4; i <= n; i++) {
               f1 = f2;
               f2 = f3;
               f3 = f2 + f1;
        }

        return f3;
    }

    public static void main(String[] args) {
        System.out.println(new _70_climbing_stairs().climbStairs(10));
    }
}
