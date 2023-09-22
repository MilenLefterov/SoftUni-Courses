package Exercises.Exercise2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String errMessage = "Invalid input!";

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int[][] matrix = new int[n][m];

        fillMatrix(matrix, n, scanner);

        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            if (command.contains("swap")) {
                command = command.replaceAll("swap ", "");

                int[] cords = Arrays.stream(command.split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                if (isValidCommand(matrix, cords)) {
                    int temp = 0;
                    temp = matrix[cords[0]][cords[1]];
                    matrix[cords[0]][cords[1]] = matrix[cords[2]][cords[3]];
                    matrix[cords[2]][cords[3]] = temp;

                    printMatrix(matrix);
                } else {
                    System.out.println(errMessage);
                }

            } else {
                System.out.println(errMessage);
            }

            command = scanner.nextLine();
        }
    }

    private static boolean isValidCommand(int[][] matrix, int[] cords) {

        if (cords.length == 4) {
            if (cords[0] >= 0 && cords[0] < matrix.length) {
                if (cords[1] >= 0 && cords[1] < matrix.length) {
                    if (cords[2] >= 0 && cords[2] < matrix.length) {
                        if (cords[3] >= 0 && cords[3] < matrix.length) {
                            return true;
                        }
                    }
                }
            }
        }


        return false;
    }

    private static void fillMatrix(int[][] matrix, int n, Scanner scan) {
        for (int row = 0; row < n; row++) {
            matrix[row] = readArr(scan);
        }
    }

    private static int[] readArr(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
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
