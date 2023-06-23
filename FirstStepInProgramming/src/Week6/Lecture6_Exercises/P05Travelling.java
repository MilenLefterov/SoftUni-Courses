package Week6.Lecture6_Exercises;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();

        while (!destination.equals("End")){
            double requiredBudget = Double.parseDouble(scan.nextLine());
            double currentSum = 0;

            while(currentSum < requiredBudget) {
               currentSum += Double.parseDouble(scan.nextLine());
           }
           System.out.printf("Going to %s!\n", destination);

           destination = scan.nextLine();
       }
    }
}
