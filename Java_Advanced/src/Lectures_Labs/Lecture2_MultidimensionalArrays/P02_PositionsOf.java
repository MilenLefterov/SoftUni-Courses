package Lectures_Labs.Lecture2_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArr(scanner);
        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < dimensions[0]; i++) {
            matrix[i] = readArr(scanner);
        }

        int target = Integer.parseInt(scanner.nextLine());

        List<String> positionsList = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j] == target) {
                    positionsList.add(i + " " + j);
                }
            }
        }

        if (!positionsList.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), positionsList));
        } else {
            System.out.println("not found");
        }
    }

    private static int[] readArr(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}