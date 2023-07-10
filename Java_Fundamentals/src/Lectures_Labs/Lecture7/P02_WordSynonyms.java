package Lectures_Labs.Lecture7;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String currentWord = scanner.nextLine();
            String currentSynonym = scanner.nextLine();

            wordsMap.putIfAbsent(currentWord, new ArrayList<>());
            wordsMap.get(currentWord).add(currentSynonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
