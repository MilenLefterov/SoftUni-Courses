package Week4.Exercises;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        String site = "";

        for (int i = 1; i <= n; i++){
            site = scan.nextLine();

            if(site.equals("Facebook"))
                salary -= 150;
                else if (site.equals("Instagram"))
                salary -= 100;
            else if (site.equals("Reddit"))
                salary -= 50;

            if(salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if(salary > 0)
            System.out.println(salary);

    }
}
