package Week2.MoreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfMagnolias = Integer.parseInt(scan.nextLine());
        int numberOfHyacinths = Integer.parseInt(scan.nextLine());
        int numberOfRoses = Integer.parseInt(scan.nextLine());
        int numberOfCacti = Integer.parseInt(scan.nextLine());
        double giftPrice = Double.parseDouble(scan.nextLine());

        double sum = (numberOfMagnolias * 3.25) + (numberOfHyacinths * 4) + (numberOfRoses * 3.50) + (numberOfCacti * 8);

        sum = sum * 0.95;//Данък

        if (sum >= giftPrice)
            System.out.printf("She is left with %.0f leva.", Math.floor(sum - giftPrice));
        else
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - sum));
    }
}
