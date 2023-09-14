package Lectures_Labs.Lecture1;

import java.util.ArrayDeque;
import java.util.Scanner;

//ArrayDeque<Integer> queue = new ArrayDeque<>();
//queue.add(element);
//queue.offer(element);
//queue.poll();
//queue.peek();

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (queue.size() == 0) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(input);
            }

            input = scanner.nextLine();
        }

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
