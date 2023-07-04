package Exercises.Exercise5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] partsOfBomb = scan.nextLine().split(" ");
        int bomb = Integer.parseInt(partsOfBomb[0]);
        int power = Integer.parseInt(partsOfBomb[1]);

        while (numList.contains(bomb)) {
            for (int j = 0; j < power; j++) {
                int bombIndex = numList.indexOf(bomb);

                int rightIndex = bombIndex + 1;
                if (rightIndex >= 1 && rightIndex < numList.size()) {
                    numList.remove(rightIndex);
                }

                int leftIndex = bombIndex - 1;
                if (leftIndex >= 0 && leftIndex < numList.size()) {
                    numList.remove(leftIndex);
                }
            }
            numList.remove(Integer.valueOf(bomb));
        }

        //print
        int sum = 0;
        for (int e : numList) {
            sum += e;
        }
        System.out.println(sum);
    }
}
