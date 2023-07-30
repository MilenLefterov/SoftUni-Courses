package ProgrammingFundamentalsFinalExam.FinalExam;

import java.util.Scanner;

public class P01_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder pass = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Complete")) {
            String[] inputDataArr = input.split(" ");
            switch (inputDataArr[0]) {
                case "Make":
                    String command = inputDataArr[1];
                    int index = Integer.parseInt(inputDataArr[2]);
                    if (command.equals("Upper")) {
                        String character = pass.charAt(index) + "";
                        pass.delete(index, index + 1);
                        pass.insert(index, character.toUpperCase());
                    } else {
                        String character = pass.charAt(index) + "";
                        pass.delete(index, index + 1);
                        pass.insert(index, character.toLowerCase());
                    }

                    System.out.println(pass);
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(inputDataArr[1]);
                    if (indexToInsert >= 0 && indexToInsert < pass.length()) {
                        String newChar = inputDataArr[2];
                        pass.insert(indexToInsert, newChar);

                        System.out.println(pass);
                    }
                    break;
                case "Replace":
                    String currentPass = pass.toString();

                    if (currentPass.contains(inputDataArr[1])) {
                        int newValue = Integer.parseInt(inputDataArr[2]);
                        int oldSymbolASCII = inputDataArr[1].charAt(0);
                        char newSymbol = (char) (newValue + oldSymbolASCII);
                        currentPass = currentPass.replace(inputDataArr[1], newSymbol + "");
                        pass = new StringBuilder(currentPass);

                        System.out.println(pass);
                    }
                    break;
                case "Validation":
                    if (pass.length() < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                    }

                    boolean upperLatter = true;
                    boolean lowerLatter = true;
                    boolean digit = true;
                    boolean others = false;
                    for (Character currentChar : pass.toString().toCharArray()) {
                        if (Character.isUpperCase(currentChar)) {
                            upperLatter = false;
                        }
                        if (Character.isLowerCase(currentChar)) {
                            lowerLatter = false;
                        }
                        if (Character.isDigit(currentChar)) {
                            digit = false;
                        }
                        if (!Character.isLetterOrDigit(currentChar) && currentChar != '_') {
                            others = true;
                        }
                    }

                    if (others) {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }
                    if (upperLatter) {
                        System.out.println("Password must consist at least one uppercase letter!");
                    }
                    if (lowerLatter) {
                        System.out.println("Password must consist at least one lowercase letter!");
                    }
                    if (digit) {
                        System.out.println("Password must consist at least one digit!");
                    }

                    break;
            }
            input = scanner.nextLine();
        }
    }
}
