package Lectures_Labs.Lecture5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int stop = numList.size() / 2;
        for (int i = 0; i < stop; i++) {
            int currentNum = numList.get(i);
            int nextNum = numList.get(numList.size() - 1);

            numList.set(i, currentNum + nextNum);
            numList.remove(numList.size() - 1);
        }

        System.out.println(joinElementsByDelimiter(numList, " "));
    }

    public static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
        StringBuilder result = new StringBuilder();

        for (int e : items) {
            result.append(e).append(delimiter);
        }

        return result.toString();
    }
}
