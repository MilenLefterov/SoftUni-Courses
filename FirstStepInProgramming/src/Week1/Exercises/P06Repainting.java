package Week1.Exercises;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        // цена на найлон с 2кв.м. резерв:
        double priceOfNylon = (nylon + 2) * 1.5;
        // цена на боята с 10% резерв:
        double priceOfPaint = (paint * 1.1) * 14.5;
        // цена на разредител:
        double priceOfThinner = thinner * 5;
        // обща цена:
        double totalPrice = priceOfNylon + priceOfPaint + priceOfThinner + 0.40; // обща сума + 40ст за торбички
        //Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали + материалите
        System.out.println((totalPrice * 0.3) * hours + totalPrice);

    }
}
