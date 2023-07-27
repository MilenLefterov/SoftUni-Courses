package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E02_ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> plantWithRarity = new LinkedHashMap<>();
        Map<String, Double> plantWithRating = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("<->");
            plantWithRarity.put(inputData[0], inputData[1]);
            plantWithRating.put(inputData[0], 0.0);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] inputData = input.split(": ");
            String[] plantData = inputData[1].split(" - ");
            switch (inputData[0]) {
                case "Rate":
                    if (plantWithRarity.containsKey(plantData[0])) {
                        double rate = Integer.parseInt(plantData[1]);
                        double currentRate = plantWithRating.get(plantData[0]);
                        if (currentRate == 0) {
                            plantWithRating.put(plantData[0], rate);
                        } else {
                            plantWithRating.put(plantData[0], (currentRate + rate) / 2);
                        }
                    } else {
                        System.out.println("error");
                    }

                    break;

                case "Update":
                    if (plantWithRarity.containsKey(plantData[0])) {
                        plantWithRarity.put(plantData[0], plantData[1]);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":
                    if (plantWithRarity.containsKey(plantData[0])) {
                        plantWithRating.put(plantData[0], 0.0);
                    } else {
                        System.out.println("error");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantWithRarity.forEach((key, value) -> System.out.printf("- %s; Rarity: %s; Rating: %.2f\n",
                key,
                value,
                plantWithRating.get(key)));
    }
}
