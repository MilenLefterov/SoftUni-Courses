package Lectures_Labs.Lecture3_SetsAndMaps;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class P05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<Double>> studentMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double currentGrade = Double.parseDouble(tokens[1]);

            studentMap.putIfAbsent(name, new ArrayList<>());
            studentMap.get(name).add(currentGrade);
        }

        for (var currentStudent : studentMap.entrySet()) {
            double sum = 0;
            System.out.print(currentStudent.getKey() + " -> ");
            for (var currentGrade : currentStudent.getValue()) {
                sum += currentGrade;
                System.out.printf("%.2f ", currentGrade);
            }
            System.out.printf("(avg: %.2f)\n", sum / currentStudent.getValue().size());
        }

    }
}
