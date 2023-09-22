package Exercises.Exercise2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int[][] matrix = new int[n][m];

        fillMatrix(matrix, n, scanner);

        int resultMatrixSize = 3;
        int[][] resultArr = new int[resultMatrixSize][resultMatrixSize];

        int maxSum = 0;
        for (int i = 0; i < matrix.length - 2; i++) {
            int currentSum = 0;
            for (int j = 0; j < matrix[i].length - 2; j++) {
                //row 0
                int currentElement = matrix[i][j];
                int firstRightElement = matrix[i][j + 1];
                int secondRightElement = matrix[i][j + 2];

                //row 1
                int row1firstBelowElement = matrix[i + 1][j];
                int row1secondBelowElement = matrix[i + 1][j + 1];
                int row1thirdBlowElement = matrix[i + 1][j + 2];

                //row2
                int row2firstBelowElement = matrix[i + 2][j];
                int row2secondBelowElement = matrix[i + 2][j + 1];
                int row2thirdBlowElement = matrix[i + 2][j + 2];

                currentSum = currentElement + firstRightElement + secondRightElement +
                        +row1firstBelowElement + row1secondBelowElement + row1thirdBlowElement +
                        row2firstBelowElement + row2secondBelowElement + row2thirdBlowElement;

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    resultArr[0][0] = currentElement;
                    resultArr[0][1] = firstRightElement;
                    resultArr[0][2] = secondRightElement;

                    resultArr[1][0] = row1firstBelowElement;
                    resultArr[1][1] = row1secondBelowElement;
                    resultArr[1][2] = row1thirdBlowElement;

                    resultArr[2][0] = row2firstBelowElement;
                    resultArr[2][1] = row2secondBelowElement;
                    resultArr[2][2] = row2thirdBlowElement;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        printMatrix(resultArr);
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

    public static void printMatrix(int[][] matrix) {
        for (int[] e : matrix) {
            for (int currentE : e) {
                System.out.print(currentE + " ");
            }
            System.out.println();
        }
    }
}
