package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E01_ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class P01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] inputDataArr = input.split("\\|");
            switch (inputDataArr[0]) {
                case "Move":
                    int endIndex = Integer.parseInt(inputDataArr[1]);
                    String buffer = message.substring(0, endIndex);
                    message.delete(0, endIndex);
                    message.append(buffer);
                    break;
                case "Insert":
                    message.insert(Integer.parseInt(inputDataArr[1]), inputDataArr[2]);
                    break;
                case "ChangeAll":
                    String currentMessage = message.toString();
                    currentMessage = currentMessage.replace(inputDataArr[1], inputDataArr[2]);
                    message = new StringBuilder(currentMessage);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", message);
    }
}
