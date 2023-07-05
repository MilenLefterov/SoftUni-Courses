package Exercises.Exercise6.P04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputDataArr = scanner.nextLine().split(" ");
            Student currentStudent = new Student(inputDataArr[0],
                    inputDataArr[1],
                    Double.parseDouble(inputDataArr[2])
            );

            studentList.add(currentStudent);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
