package Week5.MoreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String sg = "";
        String command = "";

        while (!input.equals("End")) {
            if (input.charAt(0) >= 65 && input.charAt(0) <= 90 || input.charAt(0) >= 97 && input.charAt(0) <= 122) {

                if (input.equals("c") || input.equals("o") || input.equals("n")) {
                    if (command.indexOf(input.charAt(0)) == -1)
                        command += input;
                    else
                        sg += input;
                }
                else
                    sg += input;
            }
            if (command.length() == 3) {
                System.out.printf("%s ", sg);
                sg = "";
                command = "";
            }
            input = scan.nextLine();

        }
    }
}
