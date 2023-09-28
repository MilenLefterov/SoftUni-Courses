package Exercises.Exercise3_SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        String[] tokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        for (int i = 0; i < n; i++) {
            set1.add(scanner.nextLine());
        }

        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextLine());
        }

        set1.retainAll(set2);

        for (String element : set1) {
            System.out.print(element + " ");
        }

    }
}
