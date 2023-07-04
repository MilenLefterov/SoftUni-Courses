package Exercises.Exercise3;

import java.util.Scanner;

public class P03_Zig_ZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < firstArr.length; i++) {
            String input = scan.nextLine();
            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(input.split(" ")[0]);
                secondArr[i] = Integer.parseInt(input.split(" ")[1]);
            } else {
                firstArr[i] = Integer.parseInt(input.split(" ")[1]);
                secondArr[i] = Integer.parseInt(input.split(" ")[0]);
            }
        }

        for (int el : firstArr) {
            System.out.print(el + " ");
        }
        System.out.println("");
        for (int el : secondArr) {
            System.out.print(el + " ");
        }
    }
}
