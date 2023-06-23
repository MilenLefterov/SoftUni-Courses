package PB_Exams.PB18And19February2023;

import java.util.Scanner;

public class P02FootballKit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tShirt = Double.parseDouble(scan.nextLine());
        double target = Double.parseDouble(scan.nextLine());

        double shorts = tShirt * 0.75;
        double socks = shorts * 0.20;
        double buttons = (tShirt + shorts) * 2;

        double sum = (tShirt + shorts + socks + buttons) * 0.85;

        if(sum >= target) {
            System.out.printf("Yes, he will earn the world-cup replica ball!\nHis sum is %.2f lv.", sum);
        }else {
            System.out.printf("No, he will not earn the world-cup replica ball.\nHe needs %.2f lv. more.", Math.abs(sum - target));
        }
    }
}
