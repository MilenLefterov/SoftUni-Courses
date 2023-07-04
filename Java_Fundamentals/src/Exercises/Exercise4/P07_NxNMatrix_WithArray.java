package Exercises.Exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class P07_NxNMatrix_WithArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        printMatrix(n);
    }

    public static void printMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int[] row : matrix)
            Arrays.fill(row, n);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
