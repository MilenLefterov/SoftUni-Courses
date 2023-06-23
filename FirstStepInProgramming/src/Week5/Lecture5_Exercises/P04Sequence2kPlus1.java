package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int k = 1;

        while (k <= n) {
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
