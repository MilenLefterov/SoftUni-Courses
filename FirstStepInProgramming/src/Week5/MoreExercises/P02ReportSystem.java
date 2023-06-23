package Week5.MoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int cs = 0;
        int csCount = 0;
        int cc = 0;
        int ccCount = 0;
        int i = 1;
        boolean isValid = false;

        while (!input.equals("End") && cs + cc < target) {
            int price = Integer.parseInt(input);

            if (i % 2 != 0) {
                if (price > 100)
                    System.out.println("Error in transaction!");
                else {
                    System.out.println("Product sold!");
                    cs += price;
                    csCount++;
                }
            } else {
                if (price < 10)
                    System.out.println("Error in transaction!");
                else {
                    System.out.println("Product sold!");
                    cc += price;
                    ccCount++;
                }
            }

            if (cs + cc >= target) {
                isValid = true;
                break;
            }
            i++;
            input = scan.nextLine();
        }
        if (isValid){
            System.out.printf("Average CS: %.2f\n", cs * 1.0 / csCount);
            System.out.printf("Average CC: %.2f", cc * 1.0 / ccCount);
        }
        else
            System.out.println("Failed to collect required money for charity.");
    }
}
