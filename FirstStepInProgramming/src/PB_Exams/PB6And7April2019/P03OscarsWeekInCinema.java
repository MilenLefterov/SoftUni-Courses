package PB_Exams.PB6And7April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();
        String hall = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        double sum = 0;

        switch (movieName) {
            case "A Star Is Born":
                if(hall.equals("normal")) {
                    sum += tickets * 7.50;
                }else if(hall.equals("luxury")) {
                    sum += tickets * 10.50;
                }else {
                    sum += tickets * 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if(hall.equals("normal")) {
                    sum += tickets * 7.35;
                }else if(hall.equals("luxury")) {
                    sum += tickets * 9.45;
                }else {
                    sum += tickets * 12.25;
                }
                break;
            case "Green Book":
                if(hall.equals("normal")) {
                    sum += tickets * 8.15;
                }else if(hall.equals("luxury")) {
                    sum += tickets * 10.25;
                }else {
                    sum += tickets * 13.25;
                }
                break;
            case "The Favourite":
                if(hall.equals("normal")) {
                    sum += tickets * 8.75;
                }else if(hall.equals("luxury")) {
                    sum += tickets * 11.55;
                }else {
                    sum += tickets * 13.95;
                }
                break;

        }

        System.out.printf("%s -> %.2f lv.", movieName, sum);

    }
}
