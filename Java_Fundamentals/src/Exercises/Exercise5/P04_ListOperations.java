package Exercises.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!"End".equals(input)) {
            String[] inputCommandParts = input.split(" ");

            switch (inputCommandParts[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(inputCommandParts[1]);
                    numList.add(numberToAdd);
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputCommandParts[2]);
                    if (index >= 0 && index < numList.size()) {
                        int numberToInsert = Integer.parseInt(inputCommandParts[1]);
                        numList.add(index, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(inputCommandParts[1]);
                    if (numberToRemove >= 0 && numberToRemove < numList.size()) {
                        numList.remove(numberToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int countTimes = Integer.parseInt(inputCommandParts[2]);
                    if (inputCommandParts[1].equals("left")) {
                        for (int i = 1; i <= countTimes; i++) {
                            int firstElement = numList.get(0);
                            numList.remove(0);
                            numList.add(firstElement);
                        }
                    } else {
                        for (int i = 1; i <= countTimes; i++) {
                            int lastElement = numList.get(numList.size() - 1);
                            numList.remove(numList.size() - 1);
                            numList.add(0, lastElement);
                        }
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
