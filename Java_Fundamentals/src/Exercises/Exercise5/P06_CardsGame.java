package Exercises.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstHandOfCardsP1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHandOfCardsP2 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstHandOfCardsP1.isEmpty() && !secondHandOfCardsP2.isEmpty()) {

            int firstPlayerCard = firstHandOfCardsP1.get(0);
            int secondPlayerCard = secondHandOfCardsP2.get(0);

            if (firstPlayerCard == secondPlayerCard) {
                firstHandOfCardsP1.remove(0);
                secondHandOfCardsP2.remove(0);
            } else if (firstPlayerCard > secondPlayerCard) {
                firstHandOfCardsP1.add(firstPlayerCard);
                firstHandOfCardsP1.add(secondPlayerCard);
                firstHandOfCardsP1.remove(0);
                secondHandOfCardsP2.remove(0);
            } else {
                secondHandOfCardsP2.add(secondPlayerCard);
                secondHandOfCardsP2.add(firstPlayerCard);
                secondHandOfCardsP2.remove(0);
                firstHandOfCardsP1.remove(0);
            }

        }

        if (!firstHandOfCardsP1.isEmpty()) {
            printWinner(firstHandOfCardsP1, "First");
        } else {
            printWinner(secondHandOfCardsP2, "Second");
        }
    }

    public static void printWinner(List<Integer> winList, String player) {
        int sum = 0;
        for (int e : winList) {
            sum += e;
        }
        System.out.printf("%s player wins! Sum: %d", player, sum);

    }
}
