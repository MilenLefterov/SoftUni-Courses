package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String word = "";
        double power = 0;
        double currentPower = 0;

        while (!input.equals("End of words")) {
            for (int i = 0; i < input.length(); i++) {
                currentPower += input.charAt(i);
            }
            switch (input.charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    currentPower *= input.length();
                    break;
                default:
                    currentPower = Math.floor(currentPower / input.length());
            }
            if (currentPower >= power) {
                power = currentPower;
                word = input;
            }
            currentPower = 0;
            input = scan.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", word, power);

    }
}
