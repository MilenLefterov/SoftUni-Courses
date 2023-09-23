package Exercises.Exercise2_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = new ArrayList<>();
        int rows = 0;
        int maxLength = 0;
        int rotationAngle = Integer.parseInt(
                scanner.nextLine()
                        .replaceAll("Rotate\\(", "")
                        .replaceAll("\\)", "")
        );

        int rotationTimes = getRotationTimes(rotationAngle);

        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            if (input.length() > maxLength) {
                maxLength = input.length();
            }
            wordsList.add(input);

            input = scanner.nextLine();
        }
        rows = wordsList.size();

        Character[][] matrix = new Character[rows][maxLength];
        fillMatrix(wordsList, matrix);

        for (int i = 0; i < rotationTimes; i++) {
            matrix = rotation(matrix);
        }

        printMatrix(matrix);
    }

    private static void fillMatrix(List<String> wordsList, Character[][] matrix) {
        for (int i = 0; i < wordsList.size(); i++) {
            for (int col = 0; col < matrix[i].length; col++) {

                String currentWord = wordsList.get(i);
                if (currentWord.length() > col) {
                    matrix[i][col] = currentWord.charAt(col);
                } else {
                    matrix[i][col] = ' ';
                }

            }
        }
    }

    private static int getRotationTimes(int rotationAngle) {
        int result = 0;
        if (rotationAngle >= 360) {
            if (rotationAngle % 360 != 0) {
                return (rotationAngle - ((rotationAngle / 360) * 360)) / 90;
            } else {
                return 0;
            }
        }
        return rotationAngle / 90;
    }

    public static Character[][] rotation(Character[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        Character[][] result = new Character[cols][rows];
        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0; row--) {
                result[col][rows - 1 - row] = matrix[row][col];
            }
        }

        return result;
    }

    public static void printMatrix(Character[][] matrix) {
        for (Character[] e : matrix) {
            for (Character currentE : e) {
                System.out.print(currentE);
            }
            System.out.println();
        }
    }
}
