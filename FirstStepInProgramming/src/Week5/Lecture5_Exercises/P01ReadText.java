package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        while (!s.equals("Stop")) {
            System.out.println(s);
            s = scan.nextLine();
        }
    }
}
