package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArr(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] currentLine = readArr(scanner);
            matrix[i] = currentLine;
        }

        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentSum += matrix[i][j];
            }
            totalSum += currentSum;
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(totalSum);
    }

    private static int[] readArr(Scanner scan) {
        return Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
