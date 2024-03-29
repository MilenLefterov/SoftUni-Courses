package Lectures_Labs.Lecture1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int decimalN = Integer.parseInt(scanner.nextLine());

//        System.out.println(Integer.toBinaryString(decimalN));

        if (decimalN == 0) {
            System.out.print(0);

        } else {
            while (decimalN > 0) {
                stack.push(decimalN % 2);
                decimalN /= 2;
            }

            while (stack.size() > 0) {
                System.out.print(stack.pop());
            }
        }
    }
}
