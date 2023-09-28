package Exercises.Exercise3_SetsAndMaps;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> dataSet = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            dataSet.add(scanner.nextLine());
        }

        for (String e : dataSet) {
            System.out.println(e);
        }
    }
}
