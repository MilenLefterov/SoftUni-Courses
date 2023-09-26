package Lectures_Labs.Lecture3_SetsAndMaps;

import java.text.DecimalFormat;
import java.util.*;

public class P08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, double[]> studentMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] scores = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            studentMap.put(name, scores);
        }

        DecimalFormat df = new DecimalFormat("#.########################################");
        for (var currentStudent : studentMap.entrySet()) {
            double sum = 0.0;
            for (var currentGrade : currentStudent.getValue()) {
                sum += currentGrade;
            }
            System.out.printf("%s is graduated with %s\n",
                    currentStudent.getKey(), df.format(sum / currentStudent.getValue().length));
        }
    }
}
