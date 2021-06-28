package offer;

import java.util.HashMap;
import java.util.Map;

public class _10_fib {

    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n <= 1) {
            map.put(n, n);
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            map.put(n, fib(n - 1) + fib(n - 2));
        }
        return map.get(n);
    }

}

