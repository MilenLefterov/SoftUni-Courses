package Week1.Lecture1_Exercises;

import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String city = scan.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",
                firstName, lastName, age, city);
    }
}
