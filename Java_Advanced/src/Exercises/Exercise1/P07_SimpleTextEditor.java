package Exercises.Exercise1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        Deque<String> memoryStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commandArr = scanner.nextLine().split("\\s+");

            switch (commandArr[0]) {
                case "1":
                    memoryStack.push(text.toString());
                    text.append(commandArr[1]);
                    break;

                case "2":
                    memoryStack.push(text.toString());

                    int count = Integer.parseInt(commandArr[1]);
                    int startIndex = text.length() - count;
                    int endIndex = text.length();

                    text.replace(startIndex, endIndex, "");
                    break;

                case "3":
                    int index = Integer.parseInt(commandArr[1]) - 1;

                    if (index <= text.length()) {
                        System.out.println(text.charAt(index));
                    }
                    break;

                case "4":
                    text = new StringBuilder(memoryStack.pop());
                    break;
            }
        }
    }
}
