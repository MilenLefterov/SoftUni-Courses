package Exercises.Exercise8;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filePathParts = scanner.nextLine().split("\\\\");
        String[] partsOfTheFile = filePathParts[filePathParts.length - 1].split("\\.");

        System.out.printf("File name: %s%nFile extension: %s", partsOfTheFile[0], partsOfTheFile[1]);
    }
}
