package Lectures_Labs.Lecture1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<String> pQueue = new PriorityQueue<>();

        String[] playersNamesArr = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        for (String player : playersNamesArr) {
            pQueue.offer(player);
        }

        int cycle = 1;
        while (pQueue.size() > 1) {
            for (int i = 1; i < n; i++) {
                pQueue.offer(pQueue.poll());
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + pQueue.peek());
            } else {
                System.out.println("Removed " + pQueue.poll());
            }
            cycle++;

        }

        System.out.println("Last is " + pQueue.poll());
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
