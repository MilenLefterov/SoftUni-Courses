package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E04_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_FancyBarcodes_With2Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regexBarcode = "(@[#]+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])(@[#]+)";
        Pattern patterBarcode = Pattern.compile(regexBarcode);

        String regexNum = "[0-9]+";
        Pattern patterNum = Pattern.compile(regexNum);

        for (int i = 0; i < n; i++) {
            Matcher matcherBarcode = patterBarcode.matcher(scanner.nextLine());
            if (matcherBarcode.find()) {
                String currentB = matcherBarcode.group();
                Matcher matcherNum = patterNum.matcher(currentB);

                StringBuilder currentGroup = new StringBuilder();
                while (matcherNum.find()) {
                    currentGroup.append(matcherNum.group());
                }
                if (currentGroup.length() > 0) {
                    System.out.printf("Product group: %s\n", currentGroup);
                } else {
                    System.out.println("Product group: 00");
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
