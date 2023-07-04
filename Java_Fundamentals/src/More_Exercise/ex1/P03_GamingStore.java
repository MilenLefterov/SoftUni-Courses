package More_Exercise.ex1;

import java.util.Scanner;

public class P03_GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        double sum = 0.00;

        while (!"Game Time".equals(input)) {
            switch (input) {
                case "OutFall 4":
                    if ((balance - sum) >= 39.99) {
                        System.out.println("Bought OutFall 4");
                        sum += 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if ((balance - sum) >= 15.99) {
                        System.out.println("Bought CS: OG");
                        sum += 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if ((balance - sum) >= 19.99) {
                        System.out.println("Bought Zplinter Zell");
                        sum += 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if ((balance - sum) >= 59.99) {
                        System.out.println("Bought Honored 2");
                        sum += 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if ((balance - sum) >= 29.99) {
                        System.out.println("Bought RoverWatch");
                        sum += 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if ((balance - sum) >= 39.99) {
                        System.out.println("Bought RoverWatch Origins Edition");
                        sum += 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance - sum <= 0) {
                System.out.println("Out of money!");
                break;
            }

            input = scan.nextLine();
        }
        if (balance - sum > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, Math.abs(balance - sum));
        }
    }
}
