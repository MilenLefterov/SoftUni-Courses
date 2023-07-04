package More_Exercise.ex3;

import java.util.Scanner;

public class P03_RecursiveFibonacci {

    public static int fuckingFibonacci(int n) {
        if (n == 2 || n == 1) return 1;

        return fuckingFibonacci(n - 1) + fuckingFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int requestedNumber = Integer.parseInt(scan.nextLine());

        System.out.println(fuckingFibonacci(requestedNumber));
    }
}
