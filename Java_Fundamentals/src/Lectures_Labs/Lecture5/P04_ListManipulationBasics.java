package Lectures_Labs.Lecture5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] inputCommandWithIndex = input.split(" ");

            switch (inputCommandWithIndex[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(inputCommandWithIndex[1]);
                    numList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(inputCommandWithIndex[1]);
                    numList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(inputCommandWithIndex[1]);
                    numList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(inputCommandWithIndex[1]);
                    int indexToInsert = Integer.parseInt(inputCommandWithIndex[2]);
                    numList.add(indexToInsert, numberToInsert);
            }

            input = scan.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}