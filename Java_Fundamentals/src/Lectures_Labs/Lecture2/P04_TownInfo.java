package Lectures_Labs.Lecture2;

import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int area = Integer.parseInt(scan.nextLine()); // square km

        String result = String.format("Town %s has population of %d and area %d square km.", town, population, area);

        System.out.println(result);
    }
}
