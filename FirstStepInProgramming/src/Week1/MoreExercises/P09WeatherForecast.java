package Week1.MoreExercises;

import java.util.Scanner;

public class P09WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();

        if (n.equals("sunny"))
        System.out.println("It's warm outside!");
        else
        System.out.println("It's cold outside!");

    }
}
