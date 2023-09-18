package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixOne = inputArr(scanner);
        int[][] matrixTow = inputArr(scanner);

        System.out.println(isEqual(matrixOne, matrixTow));
    }

    public static int[][] inputArr(Scanner scan) {
        int[] dimensions = readArr(scan);

        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i < dimensions[0]; i++) {
            int[] currentLine = readArr(scan);
            matrix[i] = currentLine;
        }

        return matrix;
    }

    private static int[] readArr(Scanner scan) {

        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static String isEqual(int[][] A, int[][] B) {
        int ARows = A.length;
        int BRows = B.length;

        if (ARows != BRows) {
            return "not equal";
        }

        for (int i = 0; i < ARows; i++) {
            if (A[i].length != B[i].length) {
                return "not equal";
            }

            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != B[i][j]) {
                    return "not equal";
                }
            }
        }

        return "equal";
    }
}
