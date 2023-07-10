package Lectures_Labs.Lecture7;

import java.util.*;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine()
                .toLowerCase()
                .split("\\s+");

        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String currentWord : words) {
            wordCounts.putIfAbsent(currentWord, 0);
            wordCounts.put(currentWord, wordCounts.get(currentWord) + 1);
        }

        List<String> result = new ArrayList<>();
        for (var entry : wordCounts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }

        System.out.printf("%s\n", String.join(", ", result));
    }
}
