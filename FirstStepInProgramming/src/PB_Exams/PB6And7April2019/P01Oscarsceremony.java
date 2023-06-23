package PB_Exams.PB6And7April2019;

import java.util.Scanner;

public class P01Oscarsceremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());
        double statuettes = rent * 0.7;
        double catering = statuettes * 0.85;
        double sound = catering * 0.5;

        System.out.printf("%.2f", rent + statuettes + catering + sound);
    }
}
