package Exercises.Exercise7;

import java.util.*;

public class P07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> inventriMap = new LinkedHashMap<>();
        inventriMap.put("shards", 0);
        inventriMap.put("fragments", 0);
        inventriMap.put("motes", 0);

        boolean isWin = false;
        while (!isWin) {
            String[] inputDataArr = scanner.nextLine().split("\\s+");
            for (int i = 0; i < inputDataArr.length - 1; i += 2) {
                int currentQuantity = Integer.parseInt(inputDataArr[i]);
                String currentItemName = inputDataArr[i + 1].toLowerCase();

                inventriMap.putIfAbsent(currentItemName, 0);
                inventriMap.put(currentItemName, inventriMap.get(currentItemName) + currentQuantity);

                if (inventriMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    inventriMap.put("shards", inventriMap.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (inventriMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    inventriMap.put("fragments", inventriMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (inventriMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    inventriMap.put("motes", inventriMap.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
        }

        inventriMap.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
    }
}
