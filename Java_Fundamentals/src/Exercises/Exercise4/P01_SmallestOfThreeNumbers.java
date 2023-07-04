package Exercises.Exercise4;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());

        System.out.println(getSmallestNum(firstNum, secondNum, thirdNum));

    }

    public static int getSmallestNum(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            return n1;
        } else if (n2 <= n1 && n2 <= n3) {
            return n2;
        } else {
            return n3;
        }
    }

}
