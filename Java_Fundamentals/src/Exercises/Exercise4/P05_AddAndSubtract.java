package Exercises.Exercise4;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());


        System.out.println(
                subtract(sum(n1, n2), n3)
        );

    }

    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
