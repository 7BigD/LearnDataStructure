package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author BigD
 * @Create 2021-03-27 16:18
 */
public class _08_01_interview {

        public int waysToStep(int n) {
            if (n == 1) return 1;
            if (n == 2) return 2;
            if (n == 3) return 4;
            int f1 = 1;
            int f2 = 2;
            int f3 = 4;
            for(int i = 4; i <= n; i++) {
                int tem = ((f1 + f2)%1000000007 + f3)%1000000007;
                f1 = f2%1000000007;
                f2 = f3%1000000007;
                f3 = tem%1000000007;
            }
            return f3;

        }



        public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = in.readLine()) != null) {
                int n = Integer.parseInt(line);

                int ret = new _08_01_interview().waysToStep(n);

                String out = String.valueOf(ret);

                System.out.print(out);
            }
        }

}
