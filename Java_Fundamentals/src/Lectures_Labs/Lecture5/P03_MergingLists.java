package Lectures_Labs.Lecture5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numListOne = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numListTwo = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numListResult = new ArrayList<>();

        int stop = 0;
        if (numListOne.size() <= numListTwo.size()) {
            stop = numListOne.size();
        } else {
            stop = numListTwo.size();
        }

        for (int i = 0; i < stop; i++) {
            numListResult.add(numListOne.get(0));
            numListOne.remove(0);
            numListResult.add(numListTwo.get(0));
            numListTwo.remove(0);
        }

        if (!numListOne.isEmpty()) {
            numListResult.addAll(numListOne);
        } else if (!numListTwo.isEmpty()) {
            numListResult.addAll(numListTwo);

        }

        System.out.println(joinElementsByDelimiter(numListResult, " "));
    }

    public static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
        StringBuilder result = new StringBuilder();

        for (int e : items) {
            result.append(e).append(delimiter);
        }

        return result.toString();
    }
}
