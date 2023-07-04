package More_Exercise.ex2;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        do {
            input = scan.nextLine();

            String temp = input.toLowerCase();
            if (temp.equals("true") || temp.equals("false")) {
                System.out.printf("%s is boolean type\n", input);
                continue;
            }

            if ((input.length() == 1) && ((int) input.charAt(0) < 48 || (int) input.charAt(0) > 57)) {
                System.out.printf("%s is character type\n", input);
                continue;
            }

            boolean isInt = false;
            boolean isFloating = false;
            int countPunctuationMark = 0;
            for (int i = 0; i < input.length(); i++) {
                if ((input.charAt(i) == '-') || (input.charAt(i) == '-')) {
                    continue;
                }
                if ((int) input.charAt(i) >= 48 && (int) input.charAt(i) <= 57) {
                    isInt = true;
                } else if (input.charAt(i) == ',' || input.charAt(i) == '.') {
                    isFloating = true;
                    countPunctuationMark++;
                } else {
                    isInt = false;
                    isFloating = false;
                    break;
                }
            }
            if (isFloating && countPunctuationMark == 1) {
                System.out.printf("%s is floating point type\n", input);
                continue;
            }
            if (isInt && countPunctuationMark < 1) {
                System.out.printf("%s is integer type\n", input);
                continue;
            }

            if (!input.equals("END")) {
                System.out.printf("%s is string type\n", input);
            }

        } while (!input.equals("END"));
    }
}
