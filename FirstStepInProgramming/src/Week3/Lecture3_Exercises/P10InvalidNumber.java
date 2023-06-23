package Week3.Lecture3_Exercises;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if ((num < 100 || num > 200) && num !=0)
            System.out.println("invalid");

    }
}


