package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String in = scan.nextLine();
        int min = Integer.MAX_VALUE;

        while (!in.equals("Stop")) {
            int currentInput = Integer.parseInt(in);

            if (currentInput < min)
                min = currentInput;

            in = scan.nextLine();
        }
        System.out.println(min);

    }
}
