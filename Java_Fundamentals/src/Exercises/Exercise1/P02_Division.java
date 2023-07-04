package Exercises.Exercise1;

import java.util.Scanner;

public class P02_Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNum = Integer.parseInt(scan.nextLine());
        int flag = 0;

        if (givenNum % 10 == 0) {
            flag = 10;
        } else if (givenNum % 7 == 0) {
            flag = 7;
        } else if (givenNum % 6 == 0) {
            flag = 6;
        } else if (givenNum % 3 == 0) {
            flag = 3;
        } else if (givenNum % 2 == 0) {
            flag = 2;
        }

        switch (flag){
            case 10:
                System.out.println("The number is divisible by 10");
                break;
            case 7:
                System.out.println("The number is divisible by 7");
                break;
            case 6:
                System.out.println("The number is divisible by 6");
                break;
            case 3:
                System.out.println("The number is divisible by 3");
                break;
            case 2:
                System.out.println("The number is divisible by 2");
                break;
            default:
                System.out.println("Not divisible");
                break;

        }
    }

}
