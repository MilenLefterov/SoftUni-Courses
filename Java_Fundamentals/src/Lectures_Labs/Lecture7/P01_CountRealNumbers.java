package Lectures_Labs.Lecture7;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> countRealNumMap = new TreeMap<>();

        for (double e : inputArr) {
            countRealNumMap.putIfAbsent(e, 0);
            countRealNumMap.put(e, countRealNumMap.get(e) + 1);

        }

        for (Map.Entry<Double, Integer> entry : countRealNumMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
