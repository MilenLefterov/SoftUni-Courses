package Lectures_Labs.Lecture3_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Double, Integer> countMap = new LinkedHashMap<>();

        String[] elements = scanner.nextLine().split("\\s+");

        for (int i = 0; i < elements.length; i++) {
            double currentNum = Double.parseDouble(elements[i]);
            countMap.putIfAbsent(currentNum, 0);
            countMap.put(currentNum, countMap.get(currentNum) + 1);
        }

        for (var e : countMap.entrySet()) {
            System.out.printf("%.1f -> %d\n", e.getKey(), e.getValue());
        }

    }
}
