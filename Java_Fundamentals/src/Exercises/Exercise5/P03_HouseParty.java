package Exercises.Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> namesList = new ArrayList<>();

        int numberOfNames = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfNames; i++) {
            String[] commandParts = scan.nextLine().split(" ");

            if (commandParts.length == 3) {
                if (!namesList.contains(commandParts[0])) {
                    namesList.add(commandParts[0]);
                } else {
                    System.out.println(commandParts[0] + " is already in the list!");
                }
            } else {
                if (namesList.contains(commandParts[0])) {
                    namesList.remove(commandParts[0]);
                } else {
                    System.out.println(commandParts[0] + " is not in the list!");
                }
            }
        }

        for (String e : namesList) {
            System.out.println(e);
        }
    }
}
