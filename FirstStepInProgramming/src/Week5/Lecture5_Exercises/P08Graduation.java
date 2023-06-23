package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String studentName = scan.nextLine();
        double averageGrade = 0;
        int classAtSchool = 0;
        int poorGrade = 0;

        while (classAtSchool < 12) {
            if(poorGrade > 1)
                break;

            double grade = Double.parseDouble(scan.nextLine());

            if (grade >= 4) {
                averageGrade += grade;
                classAtSchool++;
            }
            else {
                poorGrade++;
                classAtSchool++;
            }

        }
        if(poorGrade < 1)
        System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade/classAtSchool);
        else
            System.out.printf("%s has been excluded at %d grade", studentName, classAtSchool -1);

    }
}
