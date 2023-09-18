package Lectures_Labs.Lecture1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> historyBackStack = new ArrayDeque<>();
        ArrayDeque<String> historyForwardStack = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (historyBackStack.size() > 1) {
                    historyForwardStack.push(historyBackStack.pop());
                    System.out.println(historyBackStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (input.equals("forward")) {
                if (historyForwardStack.size() > 0) {
                    System.out.println(historyForwardStack.peek());
                    historyBackStack.push(historyForwardStack.pop());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                historyBackStack.push(input);
                System.out.println(historyBackStack.peek());
                while (historyForwardStack.size() > 0) {
                    historyForwardStack.pop();
                }
            }

            input = scanner.nextLine();
        }
    }
}
