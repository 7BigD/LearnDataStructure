package Recursion;

/**
 * @author BigD
 * @Create 2021-03-27 17:24
 */
public class _50_myPow {
    public double myPow(double x, int n) {

        for (int i = n; i > 0; i = i / 2) {
            if (i % 2 == 0) {
                x = x * x;
            } else {
                x = x * x ;
            }
        }
        return 0;

    }

    public double myPow2help(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double subresult = myPow2help(x, n / 2);
        if (n % 2 == 1) {
            return subresult * subresult * x;
        }
        else return subresult * subresult;
    }

    public double myPow2(double x, long n) {
        if (n < 0) {
            n = -n;
            x = 1.0/x;
        }
        return myPow2help(x, n);
    }
    public static void main(String[] args) {
        _50_myPow myPow = new _50_myPow();
        System.out.println(myPow.myPow2(2.0, -2147483648));
    }
}
