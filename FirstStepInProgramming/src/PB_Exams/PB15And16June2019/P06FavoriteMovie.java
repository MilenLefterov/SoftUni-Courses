package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String name = "";
        int inputCounter = 0;

        while (!command.equals("STOP")) {
            inputCounter++;
            int currentSum = 0;
            if (inputCounter == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            int stringLength = command.length();
            for (int i = 0; i < stringLength; i++) {
                int select = command.charAt(i);

                if (select >= 65 && select <= 90)
                    currentSum += select - stringLength;
                else if (select >= 97 && select <= 122)
                    currentSum += select - (stringLength * 2);
                else
                    currentSum += select;
            }

            if (currentSum > maxPoints) {
                maxPoints = currentSum;
                name = command;
            }

            command = scan.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", name, maxPoints);
    }
}
