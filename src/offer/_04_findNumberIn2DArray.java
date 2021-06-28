package offer;

import org.junit.jupiter.api.Test;

public class _04_findNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }else if (matrix[row][col] < target) {
                row++;
            }else if (matrix[row][col] > target) {
                col--;
            }
        }
        return false;
    }


    @Test
    public void test() {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int taget = 5;
        boolean b = findNumberIn2DArray(matrix, taget);
        System.out.printf(String.valueOf(b));
    }
}
