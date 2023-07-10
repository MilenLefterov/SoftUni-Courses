package Exercises.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] inputCharactersArr = scanner.nextLine()
                .replace(" ", "")
                .toCharArray();

        Map<Character, Integer> countCharactersMap = new LinkedHashMap<>();

        for (char c : inputCharactersArr) {
            countCharactersMap.putIfAbsent(c, 0);
            countCharactersMap.put(c, countCharactersMap.get(c) + 1);
        }

        //Print:
        countCharactersMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
