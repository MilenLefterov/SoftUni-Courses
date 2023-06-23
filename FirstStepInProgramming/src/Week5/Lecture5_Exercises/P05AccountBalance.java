package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String in = scan.nextLine();
        double sum = 0;

        while (!in.equals("NoMoreMoney")) {
            double currentInput = Double.parseDouble(in);

            if (currentInput >= 0) {
            sum += currentInput;
            System.out.printf("Increase: %.2f\n", currentInput);
        }
            else {
                System.out.println("Invalid operation!");
                break;
            }

            in = scan.nextLine();
        }
        System.out.printf("Total: %.2f\n", sum);

    }
}
