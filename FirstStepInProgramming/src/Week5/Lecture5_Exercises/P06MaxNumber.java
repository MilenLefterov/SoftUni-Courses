package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String in = scan.nextLine();
        int max = Integer.MIN_VALUE;

        while (!in.equals("Stop")) {
            int currentInput = Integer.parseInt(in);

            if (currentInput > max)
                max = currentInput;

            in = scan.nextLine();
        }
        System.out.println(max);

    }
}
