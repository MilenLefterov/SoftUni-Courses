package Exercises.Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        while (!numList.isEmpty()) {
            int index = Integer.parseInt(scan.nextLine());
            int currentNum = 0;
            if (index >= 0 && index < numList.size()) {
                currentNum = numList.get(index);
                sum += currentNum;
                numList.remove(Integer.valueOf(currentNum));

            } else if (index < 0) {
                currentNum = numList.get(0);
                sum += currentNum;
                numList.set(0, numList.get(numList.size() - 1));

            } else {
                currentNum = numList.get(numList.size() - 1);
                sum += currentNum;
                numList.set(numList.size() - 1, numList.get(0));

            }

            for (int i = 0; i < numList.size(); i++) {
                int currentElement = numList.get(i);
                if (currentElement <= currentNum) {
                    numList.set(i, currentElement + currentNum);
                } else {
                    numList.set(i, currentElement - currentNum);
                }
            }
        }
        System.out.println(sum);
    }
}
