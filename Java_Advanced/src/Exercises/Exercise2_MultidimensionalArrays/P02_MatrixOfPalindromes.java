package Exercises.Exercise2_MultidimensionalArrays;

import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        String[][] matrix = new String[n][m];

        fillMatrix(n, m, matrix);

        printMatrix(matrix);
    }

    private static void fillMatrix(int n, int m, String[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                char firstSymbol = (char) ('a' + row);
                char secondSymbol = (char) ('a' + row + col);

                matrix[row][col] = String.valueOf(firstSymbol) +
                        String.valueOf(secondSymbol) +
                        String.valueOf(firstSymbol);
            }
        }
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] e : matrix) {
            for (String currentE : e) {
                System.out.print(currentE + " ");
            }
            System.out.println();
        }
    }
}