package Week6.MoreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.nextLine();
        String stop = scan.nextLine();
        String miss = scan.nextLine();
        int count = 0;

        for (int i = start.charAt(0); i <= stop.charAt(0); i++) {
            if (i == miss.charAt(0))
                continue;
            for (int j = start.charAt(0); j <= stop.charAt(0); j++) {
                if (j == miss.charAt(0))
                    continue;
                for (int k = start.charAt(0); k <= stop.charAt(0); k++) {
                    if (k == miss.charAt(0))
                        continue;
                    System.out.printf("%s%s%s ", (char) i, (char) j, (char) k);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
