package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        int occupiedSeats = 0;
        double sum = 0;

        while (!command.equals("Movie time!")) {
            int currentOccupiedSeats = Integer.parseInt(command);
            occupiedSeats += currentOccupiedSeats;
            if(occupiedSeats > capacity){
                System.out.println("The cinema is full.");
                break;
            }

            if(currentOccupiedSeats % 3 == 0)
                sum += (currentOccupiedSeats * 5) - 5;
            else
                sum += (currentOccupiedSeats * 5);

            command = scan.nextLine();
        }

        if (command.equals("Movie time!"))
            System.out.printf("There are %d seats left in the cinema.\n", capacity - occupiedSeats);

            System.out.printf("Cinema income - %.0f lv.\n", sum);
    }
}
