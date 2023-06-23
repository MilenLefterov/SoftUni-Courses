package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int currentPoints = 0;
        String winner = "";
        int totalPoints = 0;

        while (!name.equals("Stop")) {
            for (int i = 0; i < name.length(); i++) {
                int number = Integer.parseInt(scan.nextLine());
                if (name.charAt(i) == number)
                    currentPoints += 10;
                else
                    currentPoints += 2;

            }
            if(currentPoints >= totalPoints){
                winner = name;
                totalPoints = currentPoints;
            }
            currentPoints = 0;
            name = scan.nextLine();

        }

        System.out.printf("The winner is %s with %d points!", winner, totalPoints);

    }
}
