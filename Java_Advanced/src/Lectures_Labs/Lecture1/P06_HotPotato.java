package Lectures_Labs.Lecture1;

import java.util.ArrayDeque;
import java.util.Scanner;


//Stack - Last In First Out (LIFO)
//      ▪ push(), pop(), peek()
// Queue - First In First Out (FIFO)
//      ▪ offer(), poll(), peek()

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] playersNamesArr = scanner.nextLine().split("\\s+");
        int cycles = Integer.parseInt(scanner.nextLine());

        for (String player : playersNamesArr) {
            queue.offer(player);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < cycles; i++) {
                queue.offer(queue.poll());
            }

            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());

    }
}
