package Exercises.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String command = scan.nextLine();

        while (!command.equals("end")) {
            String currentCommand = command.split(" ")[0];
            if (currentCommand.equals("decrease")) {
                for (int i = 0; i < numbersArr.length; i++) {
                    numbersArr[i]--;
                }
            } else {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                switch (currentCommand) {
                    case "swap":

                        int swap = numbersArr[index1];
                        numbersArr[index1] = numbersArr[index2];
                        numbersArr[index2] = swap;
                        break;
                    case "multiply":
                        numbersArr[index1] = numbersArr[index1] * numbersArr[index2];
                        break;

                }
            }


            command = scan.nextLine();
        }

        System.out.println(Arrays.toString(numbersArr).replace("[", "").replace("]", ""));

    }
}
