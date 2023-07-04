package Lectures_Labs.Lecture1;

import java.util.Scanner;

public class P10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //{theInteger} X {times} = {product}

        int theInteger = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", theInteger, i, theInteger * i);
        }

    }
}
