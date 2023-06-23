package Week5.Exercises;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        int availableSpace = w * l * h;

        String box = scan.nextLine();

        while (!box.equals("Done") && availableSpace > 0) {
            availableSpace -= Integer.parseInt(box);
            if (availableSpace > 0)
                box = scan.nextLine();
        }
        if (availableSpace > 0)
            System.out.printf("%d Cubic meters left.", availableSpace);
        else
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));

    }
}
