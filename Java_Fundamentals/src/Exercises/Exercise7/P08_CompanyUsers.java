package Exercises.Exercise7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> coursesMap = new LinkedHashMap<>();

        String splitRegex = " -> ";
        String[] inputData = scanner.nextLine().split(splitRegex);
        while (!inputData[0].equals("End")) {

            coursesMap.putIfAbsent(inputData[0], new ArrayList<>());
            if (!coursesMap.get(inputData[0]).contains(inputData[1])) {
                coursesMap.get(inputData[0]).add(inputData[1]);
            }

            inputData = scanner.nextLine().split(splitRegex);
        }

        for (Map.Entry<String, ArrayList<String>> entry : coursesMap.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }

    }
}
