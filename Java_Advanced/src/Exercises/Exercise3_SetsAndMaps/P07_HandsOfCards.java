package Exercises.Exercise3_SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class P07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"JOKER".equals(input)) {
            String name = input.split(": ")[0];
            String cards = input.split(": ")[1];
            String[] cardsArr = cards.split(", ");

            map.putIfAbsent(name, new LinkedHashSet<>());
            map.get(name).addAll(Arrays.stream(cardsArr).collect(Collectors.toList()));

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            System.out.printf("%s: %d\n",
                    entry.getKey(),
                    getPower(entry.getValue()));
        }
    }

    public static int getPower(Set<String> cards) {
        int power = 0;

        for (String card : cards) {
            power += returnPower(card);
        }

        return power;
    }

    public static int returnPower(String card) {
        int typePower = 0;
        int power = 0;

        char cardType = card.charAt(card.length() - 1);
        switch (cardType) {
            case 'S':
                typePower = 4;
                break;
            case 'H':
                typePower = 3;
                break;
            case 'D':
                typePower = 2;
                break;
            case 'C':
                typePower = 1;
                break;
        }

        String cardPower = card.substring(0, card.length() - 1);
        switch (cardPower) {
            case "2":
                power = 2;
                break;
            case "3":
                power = 3;
                break;
            case "4":
                power = 4;
                break;
            case "5":
                power = 5;
                break;
            case "6":
                power = 6;
                break;
            case "7":
                power = 7;
                break;
            case "8":
                power = 8;
                break;
            case "9":
                power = 9;
                break;
            case "10":
                power = 10;
                break;
            case "J":
                power = 11;
                break;
            case "Q":
                power = 12;
                break;
            case "K":
                power = 13;
                break;
            case "A":
                power = 14;
                break;
        }

        return power * typePower;
    }
}
