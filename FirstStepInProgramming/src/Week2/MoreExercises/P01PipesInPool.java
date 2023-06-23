package Week2.MoreExercises;
import java.util.Scanner;
public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double debitForHoursP1 = p1 * h;
        double debitForHoursP2 = p2 * h;

        double fillingThePool = debitForHoursP1 + debitForHoursP2;
        //процент х от y | 12 / 86 = 0,140 => 0,140 * 100 => 14%
        double poolFillInPercent = (fillingThePool / v) * 100; //

        double p1InPercent = (debitForHoursP1 / fillingThePool) * 100;
        double p2InPercent = (debitForHoursP2 / fillingThePool) * 100;

        if (fillingThePool <= v)
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolFillInPercent, p1InPercent, p2InPercent);
        else
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, fillingThePool - v);
    }
}
