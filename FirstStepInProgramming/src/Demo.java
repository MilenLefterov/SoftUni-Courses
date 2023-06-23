import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSum = 0;

        while (!input.equals("closed")) {

            if (input.equals("haircut")) {
                String typeOfHair = scanner.nextLine();
                if (typeOfHair.equals("mens")) {
                    totalSum += 15;
                } else if (typeOfHair.equals("ladies")) {
                    totalSum += 20;
                } else if (typeOfHair.equals("kids")) {
                    totalSum += 10;
                }
            } else if (input.equals("color")) {
                String serviceType = scanner.nextLine();
                if (serviceType.equals("touch up")) {
                    totalSum += 20;
                } else if (serviceType.equals("full color")) {
                    totalSum += 30;
                }
            }

            if (totalSum >= target){
                break;
            }

            input = scanner.nextLine();
        }

        if (totalSum >= totalSum) {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %.2flv.", totalSum);
        } else {
            double diff = target - totalSum;
            System.out.printf("Target not reached! You need %.2flv. more.", diff);
            System.out.printf("Earned money: %.2flv.", totalSum);
        }

    }
}
