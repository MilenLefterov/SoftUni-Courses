package Lectures_Labs.Lecture3_SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;
        while (rounds-- > 0) {
            int firstCard = firstDeck.iterator().next();
            firstDeck.remove(firstCard);

            int secondCard = secondDeck.iterator().next();
            secondDeck.remove(secondCard);

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if (firstCard < secondCard) {
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
        }

        String winner = "";

        if (firstDeck.isEmpty()) {
            winner = "Second player win!";
        } else if (secondDeck.isEmpty()) {
            winner = "First player win!";
        } else if (firstDeck.size() > secondDeck.size()) {
            winner = "First player win!";
        } else {
            winner = "Second player win!";
        }

        System.out.println(winner);
    }
}
