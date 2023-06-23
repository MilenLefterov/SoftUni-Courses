package PB_Exams.PB18And19February2023;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();

        double sum = 0;

        switch (season) {
            case "spring":
                if (numberOfPeople <= 5) {
                    sum = numberOfPeople * 50;
                } else {
                    sum = numberOfPeople * 48;
                }
                break;
            case "summer":
                if (numberOfPeople <= 5) {
                    sum = numberOfPeople * 48.50;
                } else {
                    sum = numberOfPeople * 45;
                }
                sum *= 0.85;
                break;
            case "autumn":
                if (numberOfPeople <= 5) {
                    sum = numberOfPeople * 60;
                } else {
                    sum = numberOfPeople * 49.50;
                }
                break;
                case "winter":
                    if (numberOfPeople <= 5) {
                        sum = numberOfPeople * 86;
                    } else {
                        sum = numberOfPeople * 85;
                    }
                    sum *= 1.08;
                break;

        }
        System.out.printf("%.2f leva.", sum);
    }
}
