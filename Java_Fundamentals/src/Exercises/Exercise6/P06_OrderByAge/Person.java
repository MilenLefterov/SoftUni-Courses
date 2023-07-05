package Exercises.Exercise6.P06_OrderByAge;

public class Person {
    private String name;
    private String ID;
    private int age;

    public Person(String fName, String lName, int age) {
        this.name = fName;
        this.ID = lName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }
}
