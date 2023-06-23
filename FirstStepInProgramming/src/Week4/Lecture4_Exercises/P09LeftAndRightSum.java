package Week4.Lecture4_Exercises;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int left = 0;
        int right = 0;

        for (int i = 1; i <= n*2; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (i <= n)
                left = left + num;
            else
                right = right + num;
        }
        if(left == right)
            System.out.printf("Yes, sum = %d\n",left);
        else
            System.out.printf("No, diff = %d",Math.abs(left - right));
    }
}
