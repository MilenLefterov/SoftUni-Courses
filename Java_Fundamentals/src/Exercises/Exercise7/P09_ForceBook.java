package Exercises.Exercise7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> forceBookMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String[] inputData = input.split(" \\| ");
                if (!isItContains(forceBookMap, inputData[1])) {
                    forceBookMap.putIfAbsent(inputData[0], new ArrayList<>());
                    forceBookMap.get(inputData[0]).add(inputData[1]);
                }
            }
            if (input.contains(" -> ")) {
                String[] inputData = input.split(" -> ");

                if (isItContains(forceBookMap, inputData[0])) {
                    for (Map.Entry<String, ArrayList<String>> entry : forceBookMap.entrySet()) {
                        entry.getValue().remove(inputData[0]);
                    }
                }
                forceBookMap.putIfAbsent(inputData[1], new ArrayList<>());
                forceBookMap.get(inputData[1]).add(inputData[0]);

                System.out.printf("%s joins the %s side!\n", inputData[0], inputData[1]);
            }

            input = scanner.nextLine();
        }


        for (Map.Entry<String, ArrayList<String>> entry : forceBookMap.entrySet()) {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(e -> System.out.println("! " + e));
            }
        }
    }

    public static boolean isItContains(Map<String, ArrayList<String>> map, String name) {
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(name)) {
                return true;
            }
        }
        return false;
    }

}
