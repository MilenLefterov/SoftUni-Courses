package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_DeckOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> deckOfCardsList = Arrays
                .stream(scan.nextLine()
                        .split(", "))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputCommandParts = scan.nextLine().split(", ");

            switch (inputCommandParts[0]) {
                case "Add":
                    String cardNameToAdd = inputCommandParts[1];
                    if (deckOfCardsList.contains(cardNameToAdd)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        deckOfCardsList.add(cardNameToAdd);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    String cardNameToRemove = inputCommandParts[1];
                    if (deckOfCardsList.contains(cardNameToRemove)) {
                        deckOfCardsList.remove(cardNameToRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int cardIndexToRemove = Integer.parseInt(inputCommandParts[1]);
                    if (cardIndexToRemove >= 0 && cardIndexToRemove < deckOfCardsList.size()) {
                        deckOfCardsList.remove(cardIndexToRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int cardIndexToInsert = Integer.parseInt(inputCommandParts[1]);
                    String newCardNameToAdd = inputCommandParts[2];
                    if (cardIndexToInsert >= 0 && cardIndexToInsert < deckOfCardsList.size()) {
                        if (!deckOfCardsList.contains(newCardNameToAdd)) {
                            deckOfCardsList.add(cardIndexToInsert, newCardNameToAdd);
                            System.out.println("Card successfully added");
                        } else {
                            System.out.println("Card is already added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        System.out.println(deckOfCardsList.toString().replaceAll("[\\[\\]]", ""));
    }
}
