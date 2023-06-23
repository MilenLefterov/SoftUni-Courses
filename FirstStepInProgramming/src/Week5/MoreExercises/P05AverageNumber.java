package Week5.MoreExercises;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f", sum * 1.0/ n);
    }
}
