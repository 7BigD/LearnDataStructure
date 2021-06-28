package offer;

import org.junit.jupiter.api.Test;

public class _15_hammingWeight {

    public int hammingWeight(long n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    @Test
    public void test() {
        long n = 1111111111;
        System.out.println(hammingWeight(n));
    }
}
