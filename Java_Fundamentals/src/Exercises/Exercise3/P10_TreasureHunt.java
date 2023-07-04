package Exercises.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] loots = scan.nextLine().split("\\|");

        String command = scan.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "Loot":
                    String tempChest = Arrays.toString(loots).replaceAll("[\\[\\]\"]", "");
                    StringBuilder newChest = new StringBuilder();
                    for (int i = commandParts.length - 1; i > 0; i--) {
                        if (!tempChest.contains(commandParts[i])) {
                            newChest.append(commandParts[i]).append(", ");
                        }
                    }

                    newChest.append(tempChest);
                    loots = newChest.toString().split(", ");
                    break;
                case "Drop":
                    int indexForDrop = Integer.parseInt(command.split(" ")[1]);

                    if (indexForDrop >= 0 && indexForDrop < loots.length) {
                        String dropItem = loots[indexForDrop];
                        for (int i = indexForDrop; i < loots.length - 1; i++) {
                            loots[i] = loots[i + 1];
                        }
                        loots[loots.length - 1] = dropItem;
                    }
                    break;
                case "Steal":
                    int indexForSteal = Integer.parseInt(command.split(" ")[1]);
                    StringBuilder stealLoots = new StringBuilder();
                    int numberOfLootRemaining = loots.length - indexForSteal;
                    StringBuilder newChest2 = new StringBuilder();

                    for (int i = 0; i < loots.length; i++) {
                        if (i < numberOfLootRemaining) {
                            newChest2.append(loots[i]).append(", ");
                        } else {
                            stealLoots.append(loots[i]).append(", ");
                        }
                    }

                    loots = newChest2.toString().split(", ");
                    if (stealLoots.length() > 2) {
                        System.out.println(stealLoots.substring(0, stealLoots.length() - 2));
                    }
                    break;
            }
            command = scan.nextLine();
        }
        double sum = 0.0;
        for (int i = 0; i < loots.length; i++) {
            sum += loots[i].length();
        }
        if (sum > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", sum / loots.length);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
