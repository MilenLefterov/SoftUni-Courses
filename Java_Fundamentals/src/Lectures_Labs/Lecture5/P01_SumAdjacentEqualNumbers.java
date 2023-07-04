package Lectures_Labs.Lecture5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numList.size() - 1; i++) {
            double currentNum = numList.get(i);
            double nextNum = numList.get(i + 1);

            if (currentNum == nextNum) {
                numList.set(i, currentNum + nextNum);
                numList.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(joinElementsByDelimiter(numList, " "));
    }

    public static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        StringBuilder result = new StringBuilder();
        String pattern = "0.#";
        DecimalFormat df = new DecimalFormat(pattern);

        for (Double e : items) {
            result.append(df.format(e)).append(delimiter);
        }

        return result.toString();
    }
}
