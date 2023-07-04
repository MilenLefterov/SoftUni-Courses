package Exercises.Exercise6.P03_OpinionPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> presonsList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputDataArr = scanner.nextLine().split(" ");
            if (Integer.parseInt(inputDataArr[1]) > 30) {
                Person currentPerson = new Person(inputDataArr[0], inputDataArr[1]);
                presonsList.add(currentPerson);
            }
        }

        for (Person person : presonsList) {
            System.out.println(person.toString());
        }
    }
}
