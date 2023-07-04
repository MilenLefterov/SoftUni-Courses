package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!"Finish".equals(input)) {
            String[] inputCommandParts = input.split(" ");

            switch (inputCommandParts[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(inputCommandParts[1]);
                    numList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(inputCommandParts[1]);
                    numList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "Replace":
                    int numToReplace = Integer.parseInt(inputCommandParts[1]);
                    int newNum = Integer.parseInt(inputCommandParts[2]);
                    if (numList.contains(numToReplace)) {
                        numList.set(numList.indexOf(numToReplace), newNum);
                    }
                    break;
                case "Collapse":
                    int num = Integer.parseInt(inputCommandParts[1]);
                    numList.removeIf(e -> e < num);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
