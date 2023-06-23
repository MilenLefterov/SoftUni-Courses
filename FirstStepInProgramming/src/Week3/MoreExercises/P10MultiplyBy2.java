package Week3.MoreExercises;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Double.parseDouble(scan.nextLine());

        while (n >= 0 ) {
            System.out.printf("Result: %.2f\n",n * 2);
            n = Double.parseDouble(scan.nextLine());
        }
        System.out.println("Negative number!");
    }
}
