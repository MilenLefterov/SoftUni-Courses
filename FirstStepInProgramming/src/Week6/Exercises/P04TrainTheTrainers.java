package Week6.Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int judges = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double totalSum = 0;
        int students = 0;

        while (!input.equals("Finish")) {
            double currentSum = 0;
            for (int i = 1; i <= judges; i++) {
                currentSum += Double.parseDouble(scan.nextLine());
                students++;
            }
            totalSum += currentSum;
            System.out.printf("%s - %.2f.\n", input, currentSum / judges);
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalSum / students);
    }
}
