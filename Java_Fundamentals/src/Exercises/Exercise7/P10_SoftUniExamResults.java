package Exercises.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> studentPointsMap = new LinkedHashMap<>();
        Map<String, Integer> lanugagesCountMap = new LinkedHashMap<>();

        String splitRegex = "-";
        String[] inputData = scanner.nextLine().split(splitRegex);
        while (!inputData[0].equals("exam finished")) {
            if (!inputData[1].equals("banned")) {
                studentPointsMap.putIfAbsent(inputData[0], Integer.parseInt(inputData[2]));
                if (studentPointsMap.get(inputData[0]) < Integer.parseInt(inputData[2])) {
                    studentPointsMap.put(inputData[0], Integer.parseInt(inputData[2]));
                }
                lanugagesCountMap.putIfAbsent(inputData[1], 0);
                lanugagesCountMap.put(inputData[1], lanugagesCountMap.get(inputData[1]) + 1);
            } else {
                studentPointsMap.remove(inputData[0]);
            }
            inputData = scanner.nextLine().split(splitRegex);
        }


        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : studentPointsMap.entrySet()) {
            System.out.printf("%s | %d\n", entry.getKey(), entry.getValue());
        }

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : lanugagesCountMap.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }
}
