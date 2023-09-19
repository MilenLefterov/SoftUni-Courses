package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readArr(scanner);
        }

        int[] mistakenValuesCords = readArr(scanner);
        int target = matrix[mistakenValuesCords[0]][mistakenValuesCords[1]];
        List<int[]> correctValueList = new ArrayList<int[]>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    int sum = 0;

                    if (isValid(matrix, i - 1, j, target)) {
                        sum += matrix[i - 1][j];
                    }

                    if (isValid(matrix, i + 1, j, target)) {
                        sum += matrix[i + 1][j];

                    }

                    if (isValid(matrix, i, j - 1, target)) {
                        sum += matrix[i][j - 1];

                    }

                    if (isValid(matrix, i, j + 1, target)) {
                        sum += matrix[i][j + 1];

                    }

                    int[] correctValue = new int[3];
                    correctValue[0] = i;
                    correctValue[1] = j;
                    correctValue[2] = sum;

                    correctValueList.add(correctValue);
                }
            }
        }

        for (int[] element : correctValueList) {
            matrix[element[0]][element[1]] = element[2];
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] e : matrix) {
            for (int currentE : e) {
                System.out.print(currentE + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValid(int[][] a, int currentRow, int currentCol, int target) {
        if (currentRow < 0 || currentRow > a.length - 1) {
            return false;
        }

        if (currentCol < 0 || currentCol > a[currentRow].length - 1) {
            return false;
        }

        if (a[currentRow][currentCol] == target) {
            return false;
        }

        return true;
    }

    private static int[] readArr(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
