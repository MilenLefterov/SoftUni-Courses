package Lectures_Labs.Lecture1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> historyStack = new ArrayDeque<>();
        String currentURL = "";

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (historyStack.size() > 1) {
                    historyStack.pop();
                    System.out.println(historyStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                currentURL = input;
                System.out.println(currentURL);

                if (currentURL.length() > 0) {
                    historyStack.push(currentURL);
                }
            }

            input = scanner.nextLine();
        }
    }
}
