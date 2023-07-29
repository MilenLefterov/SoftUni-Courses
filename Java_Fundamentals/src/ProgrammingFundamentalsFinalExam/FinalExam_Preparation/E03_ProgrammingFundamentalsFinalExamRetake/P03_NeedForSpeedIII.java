package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E03_ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> carWithMileage = new LinkedHashMap<>();
        Map<String, Integer> carWithFuel = new LinkedHashMap<>();

        int maxMiles = 100000;
        int maxFuel = 75;
        int minMileage = 10000;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\|");
            carWithMileage.put(inputData[0], Integer.parseInt(inputData[1]));
            carWithFuel.put(inputData[0], Integer.parseInt(inputData[2]));
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] inputData = input.split(" : ");
            String currentCar = "";
            if (inputData.length > 1) {
                currentCar = inputData[1];
            }
            switch (inputData[0]) {
                case "Drive":
                    int miles = Integer.parseInt(inputData[2]);
                    int needFuel = Integer.parseInt(inputData[3]);

                    if (carWithFuel.get(currentCar) < needFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carWithMileage.put(currentCar, carWithMileage.get(currentCar) + miles);
                        carWithFuel.put(currentCar, carWithFuel.get(currentCar) - needFuel);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",
                                currentCar,
                                miles,
                                needFuel);
                    }
                    if (carWithMileage.get(currentCar) >= maxMiles) {
                        System.out.printf("Time to sell the %s!\n", currentCar);
                        carWithMileage.remove(currentCar);
                        carWithFuel.remove(currentCar);
                    }
                    break;

                case "Refuel":
                    int newFuel = Integer.parseInt(inputData[2]);
                    int currentFuel = carWithFuel.get(currentCar);

                    int totalFuel = currentFuel + newFuel;
                    if (totalFuel > maxFuel) {
                        totalFuel = maxFuel;
                    }
                    carWithFuel.put(currentCar, totalFuel);

                    System.out.printf("%s refueled with %d liters\n",
                            currentCar,
                            Math.abs(totalFuel - currentFuel));
                    break;

                case "Revert":
                    int newMileage = Integer.parseInt(inputData[2]);
                    int currentMileage = carWithMileage.get(currentCar);

                    carWithMileage.put(currentCar, currentMileage - newMileage);

                    if (carWithMileage.get(currentCar) < minMileage) {
                        carWithMileage.put(currentCar, minMileage);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers\n",
                                currentCar,
                                newMileage);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        carWithMileage.forEach((key, value) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",
                key,
                value,
                carWithFuel.get(key)));
    }
}
