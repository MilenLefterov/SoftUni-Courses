package Lectures_Labs.Lecture1;

import java.util.Scanner;

public class P11_MultiplicationTable2point0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //{theInteger} X {times} = {product}

        int theInteger = Integer.parseInt(scan.nextLine());
        int from = Integer.parseInt(scan.nextLine());

        for (int i = from; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", theInteger, i, theInteger * i);
        }

        if (from > 10) {
            System.out.printf("%d X %d = %d%n", theInteger, from, theInteger * from);
        }

    }
}
