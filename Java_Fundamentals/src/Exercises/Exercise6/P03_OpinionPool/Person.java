package Exercises.Exercise6.P03_OpinionPool;

public class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }
}

