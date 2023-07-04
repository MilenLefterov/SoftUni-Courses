package Exercises.Exercise2;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine()); // number of people n
        int capacity = Integer.parseInt(scan.nextLine()); // capacity of p persons.

        int courses = people / capacity;// full courses with max people
        courses += Math.ceil(((double) people % capacity) / capacity); // the other passengers
        System.out.println(courses);
    }
}
