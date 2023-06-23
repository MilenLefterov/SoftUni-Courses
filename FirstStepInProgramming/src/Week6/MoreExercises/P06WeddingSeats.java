package Week6.MoreExercises;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sector = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int places = Integer.parseInt(scan.nextLine());
        int countPlaces = 0;
        int countSector = 0;

        for (int i = 65; i <= sector.charAt(0); i++) {
            for (int j = 1; j <= row + countSector; j++) {
                int tempPlaces;
                if (j % 2 == 0)
                    tempPlaces = places + 2;
                else
                    tempPlaces = places;
                for (int k = 97; k < tempPlaces + 97; k++) {
                    System.out.printf("%s%d%s\n", (char) i, j, (char) k);
                    countPlaces++;
                }
            }
            countSector++;
        }
        System.out.println(countPlaces);
    }
}
