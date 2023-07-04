package More_Exercise.ex3;

import java.util.Scanner;

public class P01_Encrypt_SortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] texts = new String[n];

        for (int i = 0; i < texts.length; i++) {
            texts[i] = scan.nextLine();
        }

        int[] results = new int[n];
        for (int i = 0; i < texts.length; i++) {
            int sum = 0;
            for (int j = 0; j < texts[i].length(); j++) {
                switch (texts[i].toLowerCase().charAt(j)) {
                    case 97:
                    case 101:
                    case 105:
                    case 111:
                    case 117:
                        sum += texts[i].charAt(j) * texts[i].length();
                        break;
                    default:
                        sum += Math.floor(texts[i].charAt(j) * 1.0 / texts[i].length());
                        break;
                }
            }
            results[i] = sum;
        }

        //Bubble Sort:
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (results[j] > results[j + 1]) {
                    int temp = results[j];
                    results[j] = results[j + 1];
                    results[j + 1] = temp;
                }
            }
        }

        for (int element : results) {
            System.out.println(element);
        }

    }
}
