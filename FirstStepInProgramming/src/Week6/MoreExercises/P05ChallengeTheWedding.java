package Week6.MoreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int men = Integer.parseInt(scan.nextLine());
        int women = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                if (capacity > 0) {
                    capacity--;
                    System.out.printf("(%d <-> %d) ", i, j);

                }else
                    break;
            }
        }
    }
}
