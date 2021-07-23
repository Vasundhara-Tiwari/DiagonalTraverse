package main;

import java.util.Scanner;

import static solution.Solution.findDiagonalOrder;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }

        }
        int[] arr1;
        arr1=findDiagonalOrder(arr);
    }
}
