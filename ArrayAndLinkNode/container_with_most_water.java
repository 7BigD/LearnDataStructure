package ArrayAndLinkNode;

public class container_with_most_water {

    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i<height.length-1; i++) {
            for (int j = i + 1; j<height.length; j++) {
                maxArea = Math.max(maxArea, (j-i)*(Math.min(height[i],height[j])));
            }
        }
//        System.out.println();
        return maxArea;
    }

    public int maxArea2(int[] height) {
        int maxArea = 0;
        int j = height.length - 1;
        for (int i = 0; i < j; ) {
            int min = Math.min(height[i++],height[j--]);

            maxArea = Math.max(maxArea, min*(j-i+1));
//            if (height[i] < height[j]) {
//                i++;
//            }
//            else {
//                j--;
//            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new container_with_most_water().maxArea2(height));
    }

    /**
     *
     *  F(n) = F(n-1) + F(n-2);
     *
     */
    public static class climbing_stairs {

        int f1 = 1, f2 = 2, f3 = 3;
        public int climbStairs(int n) {
            if (n<=3) {
                return n;
            }
            int fn = 0;
            for (int i = 4; i <= n; i++) {
                f1 = f2 + f3;
                f2 = f3;
                f3 = f1;
            }
            return f3;
        }

        public static void main(String[] args) {
            int n = 10;
            System.out.println(new climbing_stairs().climbStairs(n));
        }

    }
}
