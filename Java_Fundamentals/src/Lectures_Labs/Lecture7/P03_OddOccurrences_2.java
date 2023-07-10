package Lectures_Labs.Lecture7;

import java.util.*;
import java.util.stream.Collectors;

public class P03_OddOccurrences_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        for (String e : inputArr) {
            String currentWord = e.toLowerCase();

            wordCountMap.putIfAbsent(currentWord, 0);
            wordCountMap.put(currentWord, wordCountMap.get(currentWord) + 1);
        }

        // resultList съдържа списък с думите, които се срещат нечетен брой пъти в дадената последователност на думи
        List<String> resultList = wordCountMap.entrySet()
                .stream()// Преобразуваме wordCountMap в стрийм от входни двойки (ключ-стойност)
                .filter(entry -> entry.getValue() % 2 != 0)  // Филтрираме само двойките с нечетна стойност (брой на срещания)
                .map(Map.Entry::getKey)  // Преобразуваме двойките в ключове (думи)
                .collect(Collectors.toList());  // Събираме ключовете в нов списък


        System.out.printf("%s\n", String.join(", ", resultList));
    }
}
