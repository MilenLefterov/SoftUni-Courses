package midExam.old;

import java.util.*;
import java.util.stream.Collectors;

public class P02_ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> shoppingList = Arrays
                .stream(scan.nextLine()
                        .split("!"))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!"Go Shopping!".equals(input)) {
            String[] inputCommandWithIndex = input.split(" ");

            switch (inputCommandWithIndex[0]) {
                case "Urgent":
                    String newProduct = inputCommandWithIndex[1];
                    if (!shoppingList.contains(newProduct)) {
                        shoppingList.add(0, newProduct);
                    }
                    break;
                case "Unnecessary":
                    String productToRemove = inputCommandWithIndex[1];
                    shoppingList.remove(productToRemove);
                    break;
                case "Correct":
                    String oldProduct = inputCommandWithIndex[1];
                    String newestProduct = inputCommandWithIndex[2];
                    if (shoppingList.contains(oldProduct)) {
                        shoppingList.set(shoppingList.indexOf(oldProduct), newestProduct);
                    }
                    break;
                case "Rearrange":
                    String productToMove = inputCommandWithIndex[1];
                    if (shoppingList.contains(productToMove)) {
                        shoppingList.remove(productToMove);
                        shoppingList.add(productToMove);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(shoppingList.toString().replaceAll("[\\[\\]]", ""));
    }
}
