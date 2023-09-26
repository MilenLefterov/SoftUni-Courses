package Lectures_Labs.Lecture3_SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingDataSet = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] tokens = input.split(", ");

            if ("IN".equals(tokens[0])) {
                parkingDataSet.add(tokens[1]);
            } else {
                parkingDataSet.remove(tokens[1]);
            }

            input = scanner.nextLine();
        }

        if (parkingDataSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parkingDataSet) {
                System.out.println(car);
            }
        }

    }
}
