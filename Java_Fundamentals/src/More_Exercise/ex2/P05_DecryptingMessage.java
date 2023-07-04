package More_Exercise.ex2;

import java.util.Scanner;

public class P05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int numberOfCharacters = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfCharacters; i++) {
            char symbol = scan.nextLine().charAt(0);
            System.out.printf("%c", (int) symbol + key);
        }

    }
}
