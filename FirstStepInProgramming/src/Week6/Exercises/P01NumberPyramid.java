package Week6.Exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int number = 1;
        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", number);
                number++;
                if (number > n) {
                    flag = true;
                    break;
                }

            }
            if (flag)
                break;
            System.out.println();
        }

    }
}
