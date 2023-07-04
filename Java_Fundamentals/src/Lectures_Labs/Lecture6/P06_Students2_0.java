package Lectures_Labs.Lecture6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Students2_0 {

    public static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String city;

        public Student(String fName, String lName, String age, String city) {
            this.firstName = fName;
            this.lastName = lName;
            this.age = age;
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

        public String getFullName() {
            return this.firstName + " " + this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    private static Student getStudentIfExists(List<Student> students, String fName, String lName) {
        for (Student student : students) {
            if (student.getFullName().equals(fName + " " + lName)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] studentDataArr = input.split(" ");

            Student existStudent = getStudentIfExists(studentList, studentDataArr[0], studentDataArr[1]);
            if (existStudent != null) {
                existStudent.setAge(studentDataArr[2]);
                existStudent.setCity(studentDataArr[3]);
            } else {
                Student currentStudent = new Student(studentDataArr[0], studentDataArr[1], studentDataArr[2], studentDataArr[3]);
                studentList.add(currentStudent);
            }
            input = scanner.nextLine();
        }

        String wantedCity = scanner.nextLine();
        for (Student student : studentList) {
            if (student.city.equals(wantedCity)) {
                System.out.printf("%s is %s years old \n", student.getFullName(), student.age);
            }
        }
    }
}
