package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArr(scanner);
        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {
            int[] currentLine = readArr(scanner);
            matrix[i] = currentLine;
        }

        int[][] subMatrix = new int[2][2];
        int maxSum = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {

                int currentElement = matrix[i][j];
                int rightElement = matrix[i][j + 1];
                int belowElement = matrix[i + 1][j];
                int belowRightElement = matrix[i + 1][j + 1];

                currentSum = currentElement + rightElement + belowElement + belowRightElement;

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    subMatrix[0][0] = currentElement;
                    subMatrix[0][1] = rightElement;
                    subMatrix[1][0] = belowElement;
                    subMatrix[1][1] = belowRightElement;
                }
            }
        }

        for (int[] e : subMatrix) {
            for (int currentE : e) {
                System.out.print(currentE + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static int[] readArr(Scanner scan) {
        return Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
