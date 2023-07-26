package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.Е05_ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cityWithPopulation = new LinkedHashMap<>();
        Map<String, Integer> cityWithGold = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String[] inputData = input.split("\\|\\|");

            cityWithPopulation.putIfAbsent(inputData[0], 0);
            cityWithGold.putIfAbsent(inputData[0], 0);

            cityWithPopulation.put(inputData[0], cityWithPopulation.get(inputData[0]) + Integer.parseInt(inputData[1]));
            cityWithGold.put(inputData[0], cityWithGold.get(inputData[0]) + Integer.parseInt(inputData[2]));

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split("=>");

            switch (inputData[0]) {
                case "Plunder":
                    int remainingPopulation = cityWithPopulation.get(inputData[1]) - Integer.parseInt(inputData[2]);
                    int remainingDold = cityWithGold.get(inputData[1]) - Integer.parseInt(inputData[3]);

                    System.out.printf("%s plundered! %s gold stolen, %s citizens killed.\n",
                            inputData[1],
                            inputData[3],
                            inputData[2]);

                    cityWithPopulation.put(inputData[1], remainingPopulation);
                    cityWithGold.put(inputData[1], remainingDold);

                    if (remainingPopulation <= 0 || remainingDold <= 0) {
                        cityWithPopulation.remove(inputData[1]);
                        cityWithGold.remove(inputData[1]);

                        System.out.printf("%s has been wiped off the map!\n", inputData[1]);
                    }

                    break;
                case "Prosper":
                    if (Integer.parseInt(inputData[2]) < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        cityWithGold.put(inputData[1], cityWithGold.get(inputData[1]) + Integer.parseInt(inputData[2]));
                        System.out.printf("%s gold added to the city treasury. %s now has %d gold.\n",
                                inputData[2],
                                inputData[1],
                                cityWithGold.get(inputData[1]));
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        if (cityWithGold.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cityWithGold.size());
            cityWithGold.forEach((key, value) -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",
                    key,
                    cityWithPopulation.get(key),
                    value));
        }
    }
}