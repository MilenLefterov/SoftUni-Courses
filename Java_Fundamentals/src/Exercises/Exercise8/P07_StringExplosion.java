package Exercises.Exercise8;

import java.util.Scanner;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        int totalPower = 0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == '>') {
                totalPower += Integer.parseInt(text.charAt(i + 1) + "");
                result.append(text.charAt(i));
            } else if (totalPower > 0) {
                totalPower--;
            } else {
                result.append(text.charAt(i));
            }
        }

        System.out.println(result);
    }
}
