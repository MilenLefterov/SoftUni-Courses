package Lectures_Labs.Lecture3_SetsAndMaps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> top3 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        int end = 3;
        if (top3.size() < 3) {
            end = top3.size();
        }

        for (int i = 0; i < end; i++) {
            System.out.print(top3.get(i) + " ");
        }
    }

}
