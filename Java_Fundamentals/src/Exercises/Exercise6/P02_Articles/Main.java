package Exercises.Exercise6.P02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Articles article = new Articles(input[0], input[1], input[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(": ");
            switch (commandParts[0]) {
                case "Edit":
                    article.setContent(commandParts[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commandParts[1]);
                    break;
                case "Rename":
                    article.setTitle(commandParts[1]);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}
