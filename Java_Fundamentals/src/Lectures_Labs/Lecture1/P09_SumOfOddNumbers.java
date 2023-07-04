package Lectures_Labs.Lecture1;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int oddNumbers = 1;
        while (numbers > 0) {
            System.out.println(oddNumbers);
            sum += oddNumbers;
            oddNumbers += 2;
            numbers--;
        }

        System.out.printf("Sum: %d", sum);
    }
}
