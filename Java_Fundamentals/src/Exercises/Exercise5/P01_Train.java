package Exercises.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagonsList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!"end".equals(input)) {
            String[] inputCommandParts = input.split(" ");

            if (inputCommandParts[0].equals("Add")) {
                wagonsList.add(Integer.parseInt(inputCommandParts[1]));
            } else {
                for (int i = 0; i < wagonsList.size(); i++) {
                    if (wagonsList.get(i) + Integer.parseInt(inputCommandParts[0]) <= maxPassengers) {
                        wagonsList.set(i, wagonsList.get(i) + Integer.parseInt(inputCommandParts[0]));
                        break;
                    }
                }
            }


            input = scan.nextLine();
        }

        for (int item : wagonsList) {
            System.out.print(item + " ");
        }
    }
}
