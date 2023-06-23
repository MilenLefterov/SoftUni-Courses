package Week6.Exercises;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sumOfPrimeNumbers = 0;
        int sumOfNonPrimeNumbers = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number > 0) {
                boolean isPrime = true;
                for (int i = 2; i < number - 1; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    sumOfPrimeNumbers += number;
                }else
                    sumOfNonPrimeNumbers += number;

            } else if(number < 0)
                System.out.println("Number is negative.");
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", sumOfPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumOfNonPrimeNumbers);
    }
}
