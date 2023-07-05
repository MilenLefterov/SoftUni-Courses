package Exercises.Exercise6.P04_Students;

import java.text.DecimalFormat;

public class Student {
    private String firstName;
    private String secondName;
    private Double grade;

    public Student(String firstName, String secondName, Double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        String pattern = "0.00";
        DecimalFormat dm = new DecimalFormat(pattern);
        return this.firstName + " " + this.secondName + ": " + dm.format(this.grade);
    }
}
