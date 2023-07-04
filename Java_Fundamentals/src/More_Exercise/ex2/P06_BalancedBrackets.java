package More_Exercise.ex2;

import java.util.Scanner;

public class P06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCharacters = Integer.parseInt(scan.nextLine());

        int openingBracket = 0;
        int closingBracket = 0;
        String isItBalanced = "UNBALANCED";

        for (int i = 0; i < numberOfCharacters; i++) {
            String inputString = scan.nextLine();

            if (inputString.charAt(0) == '(') {
                openingBracket++;
            } else if (inputString.charAt(0) == ')') {
                closingBracket++;
                if (openingBracket != closingBracket) {
                     break;
                }
            }
        }

        if ((openingBracket == closingBracket)) {
            isItBalanced = "BALANCED";
        }

        System.out.printf("%s", isItBalanced);
    }
}
