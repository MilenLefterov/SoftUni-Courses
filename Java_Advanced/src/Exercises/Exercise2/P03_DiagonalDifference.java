package Exercises.Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        fillMatrix(matrix, n, scanner);

        int sum1 = primaryDiagonal(matrix);
        int sum2 = secondaryDiagonal(matrix);

        System.out.println(Math.abs(sum1 - sum2));
    }

    private static int primaryDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    private static int secondaryDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = matrix.length - 1; i >= 0; i--) {
            sum += matrix[matrix.length - 1 - i][i];
        }

        return sum;
    }

    private static void fillMatrix(int[][] matrix, int n, Scanner scan) {
        for (int row = 0; row < n; row++) {
            matrix[row] = readArr(scan);
        }
    }

    private static int[] readArr(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
