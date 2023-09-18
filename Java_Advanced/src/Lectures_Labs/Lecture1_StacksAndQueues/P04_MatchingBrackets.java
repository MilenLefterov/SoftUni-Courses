package Lectures_Labs.Lecture1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> startIndexStack = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                startIndexStack.push(i);
            } else if (input.charAt(i) == ')') {
                System.out.println(input.substring(startIndexStack.pop(), i + 1));
            }
        }
    }
}
