package Exercises.Exercise6.P05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")) {
            Vehicle currentVehicle = new Vehicle(input[0], input[1], input[2], input[3]);
            vehicleList.add(currentVehicle);
            input = scanner.nextLine().split(" ");
        }

        String wantedVehicle = scanner.nextLine();
        while (!wantedVehicle.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(wantedVehicle)) {
                    System.out.println(vehicle);
                }
            }
            wantedVehicle = scanner.nextLine();
        }

        int countCars = 0;
        int countTrucks = 0;
        double sumOfHpCars = 0;
        double sumOfHpTrucks = 0;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")) {
                countCars++;
                sumOfHpCars += Integer.parseInt(vehicle.getHorsepower());
            } else if (vehicle.getType().equals("truck")) {
                countTrucks++;
                sumOfHpTrucks += Integer.parseInt(vehicle.getHorsepower());
            }
        }
        double averageCars = sumOfHpCars / countCars;
        if(countCars == 0) {averageCars = 0;}
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        double averageTrucks = sumOfHpTrucks / countTrucks;
        if(countTrucks == 0) {averageTrucks = 0;}
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);

    }
}
