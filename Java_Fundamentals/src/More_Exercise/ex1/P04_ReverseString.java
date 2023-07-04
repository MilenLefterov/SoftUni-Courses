package More_Exercise.ex1;

import java.util.Scanner;

public class P04_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        for (int i = inputText.length() - 1; i >= 0; i--) {
            System.out.print(inputText.charAt(i));
        }
    }
}
