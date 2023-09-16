package Exercises.Exercise1;

import java.util.*;

public class P04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> queue = new ArrayDeque<>();

        int[] commandsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = commandsArr[0];
        int S = commandsArr[1];
        int X = commandsArr[2];

        for (int i = 0; i < N; i++) {
            queue.offer(inputArr[i]);
        }

        for (int i = 0; i < S; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println("0");
        } else if (queue.contains(X)) {
            System.out.print("true");
        } else {
            System.out.print(Collections.min(queue));
        }

    }
}
