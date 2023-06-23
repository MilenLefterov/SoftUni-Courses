package Week4.MoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int period = Integer.parseInt(scan.nextLine());

        int doctors = 7;
        int reviewed = 0;
        int unreviewed = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scan.nextLine());

            if ((reviewed < unreviewed) && (i % 3 == 0)) {
                doctors++;
            }

            if (patients - doctors >= 0) {
                reviewed += doctors;
                unreviewed += Math.abs(doctors - patients);
            }else
                reviewed += (patients - doctors) + doctors;
        }

        System.out.printf("Treated patients: %d.\n", reviewed);
        System.out.printf("Untreated patients: %d.\n", unreviewed);
    }
}
