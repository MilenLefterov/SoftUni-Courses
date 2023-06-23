package Week4.MoreExercises;

        import java.util.Scanner;

public class P11OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.MIN_VALUE;

        System.out.println(Double.MIN_VALUE);

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 != 0) {
                oddSum += num;

                if (num < oddMin)
                    oddMin = num;

                if (num > oddMax || (num < 0 && oddMax == Double.MIN_VALUE))
                    oddMax = num;

            } else {
                evenSum += num;

                if (num < evenMin)
                    evenMin = num;

                if (num > evenMax || (num < 0 && evenMax == Double.MIN_VALUE))
                    evenMax = num;
            }
        }

        System.out.printf("OddSum=%.2f,\n", oddSum);
        if (oddMin == Double.MAX_VALUE)
            System.out.println("OddMin=No,");
        else
            System.out.printf("OddMin=%.2f,\n", oddMin);

        if (oddMax == Double.MIN_VALUE)
            System.out.println("OddMax=No,");
        else
            System.out.printf("OddMax=%.2f,\n", oddMax);

        System.out.printf("EvenSum=%.2f,\n", evenSum);
        if (evenMin == Double.MAX_VALUE)
            System.out.println("EvenMin=No,");
        else
            System.out.printf("EvenMin=%.2f,\n", evenMin);

        if (evenMax == Double.MIN_VALUE)
            System.out.println("EvenMax=No");
        else
            System.out.printf("EvenMax=%.2f\n", evenMax);

    }
}
