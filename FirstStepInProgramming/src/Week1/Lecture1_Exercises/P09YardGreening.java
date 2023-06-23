package Week1.Lecture1_Exercises;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double price = area * 7.61;
        double discount = price * 0.18;
        double sum = price - discount;
        System.out.printf("The final price is: %.2f lv.%n", sum);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
