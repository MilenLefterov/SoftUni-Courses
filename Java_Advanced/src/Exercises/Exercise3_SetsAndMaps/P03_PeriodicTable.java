package Exercises.Exercise3_SetsAndMaps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> elementsSet = new TreeSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");
            elementsSet.addAll(Arrays.asList(tokens));
        }

        for (String e : elementsSet) {
            System.out.print(e + " ");
        }
    }
}
