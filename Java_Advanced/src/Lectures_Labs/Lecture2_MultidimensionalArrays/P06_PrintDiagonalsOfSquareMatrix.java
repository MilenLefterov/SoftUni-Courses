package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = inputMatrix(scanner, n, n);

        //first diagonal:
        int rows = 0;
        int cols = 0;
        while (rows < n) {
            System.out.print(matrix[rows][cols] + " ");
            rows++;
            cols++;
        }
        System.out.println();

        //second diagonal:
        rows = n - 1;
        cols = 0;

        while (cols < n) {
            System.out.print(matrix[rows][cols] + " ");
            rows--;
            cols++;
        }
    }

    public static int[][] inputMatrix(Scanner scan, int r, int c) {
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            matrix[i] = readArr(scan);
        }

        return matrix;
    }

    private static int[] readArr(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
