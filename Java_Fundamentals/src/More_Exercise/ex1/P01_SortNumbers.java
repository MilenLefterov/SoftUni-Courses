package More_Exercise.ex1;

import java.util.Scanner;

public class P01_SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        if (a > b) {
            if (a > c) {
                System.out.println(a);
                if (b > c) {
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(b);
                }
            } else if (c > a) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        } else if (b > c) {
            System.out.println(b);
            if (a > c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
