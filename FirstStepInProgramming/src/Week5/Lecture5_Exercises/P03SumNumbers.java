package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < num) {
            sum += Integer.parseInt(scan.nextLine());
        }
        System.out.println(sum);
    }
}
