package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E04_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder pass = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] inputDataArr = input.split(" ");
            switch (inputDataArr[0]) {
                case "TakeOdd":
                    StringBuilder newPass = new StringBuilder();
                    for (int i = 0; i < pass.length(); i++) {
                        if (i % 2 != 0) {
                            newPass.append(pass.charAt(i));
                        }
                    }
                    pass = newPass;
                    System.out.println(pass);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(inputDataArr[1]);
                    int endIndex = startIndex + Integer.parseInt(inputDataArr[2]);
                    pass.delete(startIndex, endIndex);
                    System.out.println(pass);
                    break;
                case "Substitute":
                    String currentPass = pass.toString();
                    if (currentPass.contains(inputDataArr[1])) {
                        currentPass = currentPass.replace(inputDataArr[1], inputDataArr[2]);
                        pass = new StringBuilder(currentPass);
                        System.out.println(pass);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", pass);


    }
}
