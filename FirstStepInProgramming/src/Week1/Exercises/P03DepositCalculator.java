package Week1.Exercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double amountDeposited = Double.parseDouble(scan.nextLine());
        int termOfTheDeposit = Integer.parseInt(scan.nextLine());
        double annualInterestRate = Double.parseDouble(scan.nextLine());
        System.out.println(amountDeposited + termOfTheDeposit * ((amountDeposited * annualInterestRate * 0.01) / 12));
    }
}
