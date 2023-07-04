package Exercises.Exercise2;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());// number of lines

        String biggestModel = "";
        double maxVolume = 0.0;
        for (int i = 0; i < n; i++) {
            String currentModel = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            double currentKegVolume = Math.PI * Math.pow(radius, 2) * height;

            if (currentKegVolume > maxVolume) {
                maxVolume = currentKegVolume;
                biggestModel = currentModel;
            }
        }

        System.out.println(biggestModel);
    }
}
