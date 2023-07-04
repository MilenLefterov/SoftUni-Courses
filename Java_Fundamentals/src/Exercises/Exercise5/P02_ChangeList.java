package Exercises.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] inputCommandParts = input.split(" ");

            switch (inputCommandParts[0]) {
                case "Delete":
                    int numbersToRemove = Integer.parseInt(inputCommandParts[1]);
                    numList.removeIf(e -> e == numbersToRemove);
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputCommandParts[2]);
                    int numberToInsert = Integer.parseInt(inputCommandParts[1]);
                    numList.add(index, numberToInsert);
                    break;
            }

            input = scan.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
