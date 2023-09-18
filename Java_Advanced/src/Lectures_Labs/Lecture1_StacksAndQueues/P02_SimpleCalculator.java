package Lectures_Labs.Lecture1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

//ArrayDeque<Integer> stack = new ArrayDeque<>();
//stack.push(element);
//stack.pop();
//stack.peek();

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] tokens = scanner.nextLine().split("\\s+");

        for (int i = tokens.length - 1; i >= 0; i--) {
            stack.push(tokens[i]);
        }

        while (stack.size() > 1) {
            int firstN = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondN = Integer.parseInt(stack.pop());

            if (op.equals("+")) {
                stack.push(String.valueOf(firstN + secondN));
            } else {
                stack.push(String.valueOf(firstN - secondN));
            }
        }

        System.out.println(stack.peek());
    }
}
