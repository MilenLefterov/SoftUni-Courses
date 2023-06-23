package Week4.Lecture4_Exercises;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (i % 2 == 0)
                even = even + num;
            else
                odd = odd + num;
        }
        if (even == odd)
            System.out.printf("Yes\nSum = %d", even);
        else
            System.out.printf("No\nDiff = %d", Math.abs(even - odd));
    }
}
