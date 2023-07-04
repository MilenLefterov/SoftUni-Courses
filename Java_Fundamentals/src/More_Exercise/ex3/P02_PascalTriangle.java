package More_Exercise.ex3;

import java.util.Scanner;

public class P02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[][] triangle = new int[n][n];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                if (j == 0) {
                    triangle[i][j] = 1;
                } else if (i == j) {
                    triangle[i][j] = 1;
                    break;
                }
                if (i > 0 && j > 0) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                System.out.print(triangle[i][j] + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println("");
        }
    }
}
