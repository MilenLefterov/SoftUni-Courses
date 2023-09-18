package Exercises.Exercise1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_ReverseNumbersWithAStack {

    //Stack
    // push()
    // pop()
    // peek()

    //Queue
    // offer()
    // poll()
    // peek()
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int e : inputArr) {
            stack.push(e);
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }

    }
}
