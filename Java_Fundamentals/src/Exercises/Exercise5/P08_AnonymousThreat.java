package Exercises.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> stringList = Arrays
                .stream(scan.nextLine()
                        .split(" ")).collect(Collectors.toList());

        String inputCommand = scan.nextLine();
        while (!"3:1".equals(inputCommand)) {
            String[] inputCommandParts = inputCommand.split(" ");

            switch (inputCommandParts[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(inputCommandParts[1]);
                    int endIndex = Integer.parseInt(inputCommandParts[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }

                    if (endIndex > stringList.size() - 1) {
                        endIndex = stringList.size() - 1;
                    }

                    if (startIndex >= 0 && startIndex <= stringList.size() - 1 && endIndex >= 0 && endIndex <= stringList.size() - 1) {

                        int stop = endIndex - startIndex;
                        for (int i = 0; i < stop; i++) {
                            if (startIndex + 1 < stringList.size()) {
                                stringList.set(startIndex, stringList.get(startIndex) + stringList.get(startIndex + 1));
                                stringList.remove(startIndex + 1);
                            } else {
                                break;
                            }
                        }

                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(inputCommandParts[1]);
                    int parts = Integer.parseInt(inputCommandParts[2]);

                    if (index >= 0 && index < stringList.size()) {

                        String textForDivide = stringList.get(index);
                        stringList.remove(index);

                        int countSymbolsPerPart = textForDivide.length() / parts;

                        int beginIndex = 0;
                        for (int i = 1; i < parts; i++) {
                            stringList.add(index, textForDivide.substring(beginIndex, beginIndex + countSymbolsPerPart));
                            index++;
                            beginIndex += countSymbolsPerPart;
                        }

                        String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                        stringList.add(index, textLastParts);
                    }
                    break;
            }
            inputCommand = scan.nextLine();
        }
        System.out.println(stringList.toString().replaceAll("[\\[\\],]", ""));
    }
}
