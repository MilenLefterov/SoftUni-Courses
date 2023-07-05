package Exercises.Exercise6.P06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")) {
            Person currentPerson = new Person(input[0], input[1], Integer.parseInt(input[2]));
            personList.add(currentPerson);
            input = scanner.nextLine().split(" ");
        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.println(person.getName() + " with ID: " + person.getID() + " is " + person.getAge() + " years old.");
        }
    }
}
