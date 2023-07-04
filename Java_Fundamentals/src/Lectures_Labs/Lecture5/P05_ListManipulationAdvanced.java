package Lectures_Labs.Lecture5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
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
                    break;
                case "Contains":
                    int isItContained = Integer.parseInt(inputCommandWithIndex[1]);
                    if (numList.contains(isItContained)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    printEvenOrOddElements(numList, inputCommandWithIndex[1]);
                    break;
                case "Get":
                    System.out.println(getSum(numList));
                    break;
                case "Filter":
                    String conditionSymbol = inputCommandWithIndex[1];
                    int num = Integer.parseInt(inputCommandWithIndex[2]);

                    printWithCondition(numList, conditionSymbol, num);
                    break;
            }

            input = scan.nextLine();
        }
    }

    public static void printEvenOrOddElements(List<Integer> items, String isEven) {
        for (int e : items) {
            if ("even".equals(isEven) && e % 2 == 0) {
                System.out.print(e + " ");
            } else if ("odd".equals(isEven) && e % 2 != 0) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    public static int getSum(List<Integer> items) {
        int result = 0;
        for (int e : items) {
            result += e;
        }
        return result;
    }

    public static void printWithCondition(List<Integer> items, String condition, int num) {
        for (int e : items) {
            switch (condition) {
                case "<":
                    if (e < num) {
                        System.out.print(e + " ");
                    }
                    break;
                case ">":
                    if (e > num) {
                        System.out.print(e + " ");
                    }
                    break;
                case "<=":
                    if (e <= num) {
                        System.out.print(e + " ");
                    }
                    break;
                case ">=":
                    if (e >= num) {
                        System.out.print(e + " ");
                    }
                    break;
            }

        }
        System.out.println();

    }
}
