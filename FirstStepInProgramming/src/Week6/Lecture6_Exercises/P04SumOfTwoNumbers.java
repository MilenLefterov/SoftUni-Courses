package Week6.Lecture6_Exercises;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        boolean flag = false;
        int count = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", count, i, j, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        if (!flag)
            System.out.printf("%d combinations - neither equals %d\n", count, magicNumber);
    }
}
