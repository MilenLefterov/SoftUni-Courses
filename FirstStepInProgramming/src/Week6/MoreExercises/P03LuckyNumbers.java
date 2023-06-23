package Week6.MoreExercises;

import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
            if(i > 9)
                break;
            for (int j = 1; j <= n; j++) {
                if(j > 9)
                    break;
                for (int k = 1; k <= n; k++) {
                    if(k > 9)
                        break;
                    for (int l = 1; l <= n; l++) {
                        if(l > 9)
                            break;
                        if ((i + j) == (l + k) && (n % (i + j)) == 0)
                            System.out.printf("%d%d%d%d ", i, j, k, l);

                    }
                }
            }
        }
    }
}
