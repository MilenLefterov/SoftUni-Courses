package PB_Exams.PB6And7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfMovies = Integer.parseInt(scan.nextLine());

        double averageRating = 0;
        String maxMovieName = "";
        double maxRating = Integer.MIN_VALUE;
        String minMovieName = "";
        double minRating = Integer.MAX_VALUE;


        for (int i = 1; i <= numberOfMovies; i++) {
            String movieName = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());

            if (rating > maxRating) {
                maxMovieName = movieName;
                maxRating = rating;
            }
            if (rating < minRating) {
                minMovieName = movieName;
                minRating = rating;
            }
            averageRating += rating;

        }


        System.out.printf("%s is with highest rating: %.1f\n", maxMovieName, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", minMovieName, minRating);
        System.out.printf("Average rating: %.1f", averageRating / numberOfMovies);

    }
}
