package Exercises.Exercise3_SetsAndMaps;

import java.util.*;

public class P04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> dataMap = new TreeMap<>();

        char[] characters = scanner.nextLine().toCharArray();

        for (char character : characters) {
            dataMap.putIfAbsent(character, 0);
            dataMap.put(character, dataMap.get(character) + 1);

        }

        for (Map.Entry<Character, Integer> entry : dataMap.entrySet()) {
            System.out.printf("%c: %d time/s\n",
                    entry.getKey(),
                    entry.getValue());
        }
    }
}