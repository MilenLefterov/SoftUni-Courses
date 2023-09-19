package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 8;
        char target = 'q';
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine()
                    .replaceAll("\\s+", "")
                    .toCharArray();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    if (isValid(i, j, matrix, target)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }

    public static boolean isValid(int row, int col, char[][] matrix, char target) {
        if (up(row, col, matrix, target)) {
            return false;
        }
        if (down(row, col, matrix, target)) {
            return false;
        }
        if (left(row, col, matrix, target)) {
            return false;
        }
        if (right(row, col, matrix, target)) {
            return false;
        }
        if (diagonalLeft(row, col, matrix, target)) {
            return false;
        }
        if (diagonalRight(row, col, matrix, target)) {
            return false;
        }
        if (reverseDiagonalLeft(row, col, matrix, target)) {
            return false;
        }
        if (reverseDiagonalRight(row, col, matrix, target)) {
            return false;
        }

        return true;
    }

    //horizontal:
    public static boolean up(int row, int col, char[][] matrix, char target) {
        row--;
        if (row < 0) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return up(row, col, matrix, target);
    }

    public static boolean down(int row, int col, char[][] matrix, char target) {
        row++;
        if (row >= matrix.length) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return down(row, col, matrix, target);
    }

    //verticals
    public static boolean left(int row, int col, char[][] matrix, char target) {
        col--;
        if (col < 0) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return left(row, col, matrix, target);
    }

    public static boolean right(int row, int col, char[][] matrix, char target) {
        col++;
        if (col >= matrix[row].length) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return right(row, col, matrix, target);
    }

    //diagonals:
    public static boolean diagonalLeft(int row, int col, char[][] matrix, char target) {
        row--;
        col--;
        if (row < 0 || col < 0) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return diagonalLeft(row, col, matrix, target);
    }

    public static boolean diagonalRight(int row, int col, char[][] matrix, char target) {
        row++;
        col++;
        if (row >= matrix.length || col >= matrix[row].length) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return diagonalRight(row, col, matrix, target);
    }

    public static boolean reverseDiagonalLeft(int row, int col, char[][] matrix, char target) {
        row++;
        col--;
        if (row >= matrix.length || col < 0) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return reverseDiagonalLeft(row, col, matrix, target);
    }

    public static boolean reverseDiagonalRight(int row, int col, char[][] matrix, char target) {
        row--;
        col++;
        if (row < 0 || col >= matrix[row].length) {
            return false;
        }

        if (matrix[row][col] == target) {
            return true;
        }

        return reverseDiagonalRight(row, col, matrix, target);
    }
}