package Week5.Exercises;

import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPoorGrades = Integer.parseInt(scan.nextLine());
        int poorGrades = 0;
        boolean isValid = false;
        double averageScore = 0;
        int problemCount = 0;
        String lastProblem = "";


        while (poorGrades != numberOfPoorGrades) {
            String problem = scan.nextLine();

            if (problem.equals("Enough")){
                isValid = true;
                break;
            }

            int grade = Integer.parseInt(scan.nextLine());

            if (grade <= 4)
                poorGrades++;

            averageScore += grade;
            problemCount++;
            lastProblem = problem;
        }

        if (isValid) {
            System.out.printf("Average score: %.2f\n", averageScore / problemCount);
            System.out.printf("Number of problems: %d\n", problemCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
        else
            System.out.printf("You need a break, %d poor grades.", poorGrades);
    }
}
