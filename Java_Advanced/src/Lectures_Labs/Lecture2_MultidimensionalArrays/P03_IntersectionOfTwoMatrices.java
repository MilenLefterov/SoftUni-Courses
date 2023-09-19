package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        String[][] matrixOne = inputArr(scanner, M, N);
        String[][] matrixTwo = inputArr(scanner, M, N);
        String[][] matrixResult = new String[M][N];

        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult[i].length; j++) {
                if (matrixOne[i][j].equals(matrixTwo[i][j])) {
                    matrixResult[i][j] = matrixOne[i][j] + "";
                } else {
                    matrixResult[i][j] = "*";
                }
            }
        }

        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult[i].length; j++) {
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] inputArr(Scanner scan, int r, int c) {
        String[][] matrix = new String[r][c];

        for (int i = 0; i < r; i++) {
            matrix[i] = readArr(scan);
        }

        return matrix;
    }

    private static String[] readArr(Scanner scan) {
        return scan.nextLine().split("\\s+");
    }
}
