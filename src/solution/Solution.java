package solution;

public class Solution {
    public static int[] findDiagonalOrder(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        int[] arr1 = new int[row * col];
        boolean down = false;
        int i = 0, j = 0, k = 0;
        while (i >= 0 && i < row && j >= 0 && j < col) {
            if (down) {
                while (i < row && j >= 0)
                    arr1[k++] = arr[i++][j--];
                down = false;
                if (i < row) {
                    j = 0;
                } else {
                    i = row - 1; j += 2;
                }
            } else {
                while (i >= 0 && j < col)
                    arr1[k++] = arr[i--][j++];
                down = true;
                if (i < 0 && j < col) {
                    i++;
                } else if (i < 0 && j >= col) {
                    i += 2; j = col - 1;
                } else {
                    j = col - 1; i += 2;
                }
            }
        }
        return arr1;
    }
}
