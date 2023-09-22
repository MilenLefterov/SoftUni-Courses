package Exercises.Exercise2_MultidimensionalArrays;

import java.util.Scanner;


public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);

        int[][] matrix = new int[n][n];

        switch (tokens[1]) {
            case "A":
                patternA(matrix, n);
                break;
            case "B":
                patternB(matrix, n);
                break;
        }
        printMatrix(matrix);
    }

    private static void patternA(int[][] matrix, int n) {
        int count = 1;
        for (int cow = 0; cow < n; cow++) {
            for (int row = 0; row < n; row++) {
                matrix[row][cow] = count;
                count++;
            }
        }
    }

    private static void patternB(int[][] matrix, int n) {
        int count = 1;
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = count;
                    count++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = count;
                    count++;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] e : matrix) {
            for (int currentE : e) {
                System.out.print(currentE + " ");
            }
            System.out.println();
        }
    }
}