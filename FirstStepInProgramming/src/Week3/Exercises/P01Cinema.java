package Week3.Exercises;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        double sum = 0;

        if (projection.equals("Premiere"))
            sum = r * c * 12;
        else if (projection.equals("Normal"))
            sum = r * c * 7.5;
        else if (projection.equals("Discount"))
            sum = r * c * 5;

        System.out.printf("%.2f leva", sum);

    }
}