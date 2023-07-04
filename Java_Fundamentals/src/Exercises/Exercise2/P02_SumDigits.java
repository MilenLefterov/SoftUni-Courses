package Exercises.Exercise2;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(Character.toString(number.charAt(i)));
        }
        System.out.println(sum);
    }
}
