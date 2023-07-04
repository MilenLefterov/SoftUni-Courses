package Lectures_Labs.Lecture1;

import java.util.Scanner;

public class P01_Student_Information {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Name: {student name}, Age: {student age}, Grade: {student grade}
        System.out.printf ("Name: %s, Age: %d, Grade: %.2f", scan.nextLine(), Integer.parseInt(scan.nextLine()), Double.parseDouble(scan.nextLine()));

    }
}
