package More_Exercise.ex1;

import java.util.Scanner;

public class P05_Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String input = "";
        String output = "";

        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            int currentDigit = Integer.parseInt(String.valueOf(input.charAt(0)));
            int offset = (currentDigit - 2) * 3;
            if (input.charAt(0) == 56 || input.charAt(0) == 57) {
                offset += 1;
            }
            int index = offset + input.length() - 1 + 97;

            if (input.charAt(0) != 48) {
                output += new Character((char) index).toString();
            } else {
                output += " ";
            }

        }
        System.out.println(output);
    }
}
