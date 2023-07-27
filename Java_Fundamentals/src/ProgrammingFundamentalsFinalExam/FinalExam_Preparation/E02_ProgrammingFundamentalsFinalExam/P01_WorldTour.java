package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E02_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class P01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder places = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] inputDataArr = input.split(":");
            switch (inputDataArr[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(inputDataArr[1]);
                    if (index < places.length() && index >= 0) {
                        places.insert(index, inputDataArr[2]);

                    }
                    System.out.println(places);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(inputDataArr[1]);
                    int endIndex = Integer.parseInt(inputDataArr[2]);

                    if ((startIndex < places.length() && startIndex >= 0) && (endIndex < places.length() && endIndex >= 0)) {
                        String buf = places.toString();
                        String subStr = places.substring(startIndex, endIndex + 1);
                        buf = buf.replace(subStr, "");
                        places = new StringBuilder(buf);

                    }
                    System.out.println(places);
                    break;
                case "Switch":
                    String currentStr = places.toString();
                    if (currentStr.contains(inputDataArr[1])) {
                        currentStr = currentStr.replace(inputDataArr[1], inputDataArr[2]);
                        places = new StringBuilder(currentStr);

                    }
                    System.out.println(places);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", places);
    }
}
