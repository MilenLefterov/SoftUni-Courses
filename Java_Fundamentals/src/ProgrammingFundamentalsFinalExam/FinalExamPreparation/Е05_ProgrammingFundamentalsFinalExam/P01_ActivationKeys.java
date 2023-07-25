package ProgrammingFundamentalsFinalExam.FinalExamPreparation.Е05_ProgrammingFundamentalsFinalExam;

import java.util.Locale;
import java.util.Scanner;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();

        String substring = "";
        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] inputPartsArr = input.split(">>>");
            switch (inputPartsArr[0]) {
                case "Contains":
                    if (key.contains(inputPartsArr[1])) {
                        System.out.printf("%s contains %s\n", key, inputPartsArr[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    if (inputPartsArr[1].equals("Upper")) {
                        substring = key.substring(
                                Integer.parseInt(inputPartsArr[2]),
                                Integer.parseInt(inputPartsArr[3]));

                        key = key.replace(substring, substring.toUpperCase());
                    } else {
                        substring = key.substring(
                                Integer.parseInt(inputPartsArr[2]),
                                Integer.parseInt(inputPartsArr[3]));

                        key = key.replace(substring, substring.toLowerCase());
                    }

                    System.out.println(key);
                    break;
                case "Slice":
                    substring = key.substring(
                            Integer.parseInt(inputPartsArr[1]),
                            Integer.parseInt(inputPartsArr[2]));

                    key = key.replace(substring, "");
                    System.out.println(key);

                    break;
            }
            input = scanner.nextLine();
        }


        System.out.printf("Your activation key is: %s\n",key);
    }
}
