package Week2.Exercises;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;

        int min = totalTime / 60;
        int sec = totalTime % 60;

        if (sec < 10)
            System.out.printf("%d:%02d", min, sec);
        else
            System.out.printf("%d:%d", min, sec);

    }
}
