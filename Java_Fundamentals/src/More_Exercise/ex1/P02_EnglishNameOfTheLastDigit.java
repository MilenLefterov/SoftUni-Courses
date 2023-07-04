package More_Exercise.ex1;

import java.util.Scanner;

public class P02_EnglishNameOfTheLastDigit {

    public static String lastNumOfText(String randomText) {
        char lastNum = randomText.charAt(randomText.length() - 1);

        switch (lastNum) {
            case '0':
                randomText = "zero";
                break;
            case '1':
                randomText = "one";
                break;
            case '2':
                randomText = "two";
                break;
            case '3':
                randomText = "three";
                break;
            case '4':
                randomText = "four";
                break;
            case '5':
                randomText = "five";
                break;
            case '6':
                randomText = "six";
                break;
            case '7':
                randomText = "seven";
                break;
            case '8':
                randomText = "eight";
                break;
            case '9':
                randomText = "nine";
                break;
        }

        return randomText;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        System.out.println(lastNumOfText(text));

    }
}
