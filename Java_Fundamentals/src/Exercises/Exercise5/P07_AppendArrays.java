package Exercises.Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> resultList = new ArrayList<>();

        String[] arrays = scan.nextLine().split("\\|");
        for (int i = arrays.length - 1; i >= 0; i--) {
            String[] theNumbersFromArray = arrays[i].split(" ");
            for (int j = 0; j < theNumbersFromArray.length; j++) {
                if (!theNumbersFromArray[j].equals("")) {
                    resultList.add(theNumbersFromArray[j]);
                }
            }
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
