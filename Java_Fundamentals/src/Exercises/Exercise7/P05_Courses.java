package Exercises.Exercise7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> coursesMap = new LinkedHashMap<>();

        String splitRegex = " : ";
        String[] inputData = scanner.nextLine().split(splitRegex);
        while (!inputData[0].equals("end")) {

            coursesMap.putIfAbsent(inputData[0], new ArrayList<>());
            coursesMap.get(inputData[0]).add(inputData[1]);

            inputData = scanner.nextLine().split(splitRegex);
        }

        for (Map.Entry<String, ArrayList<String>> entry : coursesMap.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }

    }
}
