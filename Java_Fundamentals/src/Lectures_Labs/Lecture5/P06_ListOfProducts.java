package Lectures_Labs.Lecture5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> productsList = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            productsList.add(scan.nextLine());
        }

        Collections.sort(productsList);

        System.out.println(joinElementsByDelimiter(productsList, "\n"));

    }

    public static String joinElementsByDelimiter(List<String> items, String delimiter) {
        StringBuilder result = new StringBuilder();
        int index = 1;
        for (String e : items) {
            result.append(index)
                    .append('.')
                    .append(e)
                    .append(delimiter);
            index++;
        }

        return result.toString();
    }
}
