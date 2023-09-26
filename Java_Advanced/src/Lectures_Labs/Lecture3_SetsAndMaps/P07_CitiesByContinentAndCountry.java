package Lectures_Labs.Lecture3_SetsAndMaps;

import java.util.*;

public class P07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> dataMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            dataMap.putIfAbsent(continent, new LinkedHashMap<>());
            dataMap.get(continent).putIfAbsent(country, new ArrayList<>());
            dataMap.get(continent).get(country).add(city);
        }

        for (var currentContinent : dataMap.entrySet()) {
            System.out.printf("%s:\n", currentContinent.getKey());
            for (var currentCountry : currentContinent.getValue().entrySet()) {
                System.out.printf("  %s -> %s\n",
                        currentCountry.getKey(), String.join(", ", currentCountry.getValue()));
            }

        }
    }
}
