package Exercises.Exercise7;

import java.util.*;

public class P06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String currentStudentName = scanner.nextLine();
            double currentStudentGrade = Double.parseDouble(scanner.nextLine());

            studentsMap.putIfAbsent(currentStudentName, new ArrayList<>());
            studentsMap.get(currentStudentName).add(currentStudentGrade);
        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentsMap.entrySet()) {
            List<Double> grades = entry.getValue();

            //avgGrade
            double sum = 0.00;
            for (Double grade : grades) {
                sum += grade;
            }
            double avgGrade = sum / grades.size();

            //overwrite current Student with on a new ArrayList:
            studentsMap.put(entry.getKey(), new ArrayList<>());
            studentsMap.get(entry.getKey()).add(avgGrade);

        }

        studentsMap.values().removeIf(e -> e.get(0) < 4.50);

        studentsMap.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value.get(0)));
    }
}
