package Lectures_Labs.Lecture5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numList.removeIf(e -> e < 0);

        Collections.reverse(numList);

        if (numList.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
