package Week5.Exercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wantedBook = scan.nextLine();
        String currentBook = scan.nextLine();
        int count = 0;
        boolean isValid = true;


        while (!currentBook.equals("No More Books")) {
            count++;

            if (currentBook.equals(wantedBook)) {
                isValid = false;
                break;
            }

            currentBook = scan.nextLine();
        }
        if (isValid)
            System.out.printf("The book you search is not here!\nYou checked %d books.", count);
        else
            System.out.printf("You checked %d books and found it.", count - 1);
    }
}
