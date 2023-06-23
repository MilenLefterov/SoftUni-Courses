package Week5.Exercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        int pieces = h * w;

        while (pieces > 0) {
            String getPiece = scan.nextLine();
            if (getPiece.equals("STOP"))
                break;
            pieces -= Integer.parseInt(getPiece);
        }

        if (pieces >= 0) {
            System.out.printf("%d pieces are left.", pieces);
        } else
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));
    }
}
