package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E03_ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class P01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] inputDataArr = input.split(":\\|:");
            switch (inputDataArr[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(inputDataArr[1]);
                    message.insert(index, " ");

                    System.out.println(message);
                    break;
                case "Reverse":
                    String newSubstring = inputDataArr[1];

                    if (message.indexOf(newSubstring) != -1) {
                        int startIn0dex = message.indexOf(newSubstring);
                        message.delete(startIn0dex, startIn0dex + newSubstring.length());

                        StringBuilder reversedSubStr= new StringBuilder(newSubstring).reverse();
                        message.append(reversedSubStr);

                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String currentMessage = message.toString();
                    currentMessage = currentMessage.replace(inputDataArr[1], inputDataArr[2]);
                    message = new StringBuilder(currentMessage);

                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", message);
    }
}
