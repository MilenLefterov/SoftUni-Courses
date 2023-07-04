package midExam.old;

import java.util.Scanner;

public class P01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int courseLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

//{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})

        double max = 0;
        int winner = 0;
        for (int i = 0; i < students; i++) {
            int studentAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = Math.ceil(studentAttendances * 1.0 / courseLectures * (5 + bonus));
            if (max < totalBonus) {
                max = totalBonus;
                winner = studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.\n" +
                "The student has attended %d lectures.", max, winner);
    }
}