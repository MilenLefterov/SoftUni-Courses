package Exercises.Exercise1_StacksAndQueues;

import java.util.Scanner;

public class P06_RecursiveFibonacci {

    private static long[] memoryArr;
    // When an array is of type "long" by default it is filled with 0's

    public static long Fibonacci(int n) {
        if (n < 2) return 1L;

        if (memoryArr[n] != 0) {
            return memoryArr[n];
        }

        memoryArr[n] = Fibonacci(n - 1) + Fibonacci(n - 2);
        return memoryArr[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        memoryArr = new long[n + 1];

        System.out.println(Fibonacci(n));
    }
}
