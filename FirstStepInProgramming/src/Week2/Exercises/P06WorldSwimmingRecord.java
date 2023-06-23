package Week2.Exercises;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        /*
        От конзолата се четат 3 реда:
            1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
            2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
            3.	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]

        */

        double recordInSeconds  = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timeForOneMeter  = Double.parseDouble(scan.nextLine());

        double delay = Math.floor(distance / 15) * 12.5;

        /*
        Отпечатването на конзолата зависи от резултата:
            •	Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
                o	"Yes, he succeeded! The new world record is {времето на Иван} seconds."
            •	Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
                o	"No, he failed! He was {недостигащите секунди} seconds slower."
        Резултатът трябва да се форматира до втория знак след десетичната запетая.

        */
        double totalTime = distance * timeForOneMeter + delay;
        if( totalTime < recordInSeconds)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        else
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
    }
}
