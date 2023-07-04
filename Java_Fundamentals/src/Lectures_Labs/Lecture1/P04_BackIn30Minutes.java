package Lectures_Labs.Lecture1;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputHour = Integer.parseInt(scan.nextLine());
        int inputMin = Integer.parseInt(scan.nextLine());

        int iWillBeBack = 30;

        int time = (inputHour * 60) + inputMin + iWillBeBack;

        int newHour = time / 60;
        int newMin = time % 60;

        if (newHour > 23){
            newHour = 0;
        }

        System.out.printf("%d:%02d", newHour, newMin);
    }
}
