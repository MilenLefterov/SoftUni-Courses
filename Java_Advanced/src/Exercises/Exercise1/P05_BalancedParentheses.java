package Exercises.Exercise1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(IsBalanced(input));
    }

    private static String IsBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character ch : input.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return "NO";
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return "NO";
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return "NO";
                    }
                    break;
                default:
                    return "NO";
            }

        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
