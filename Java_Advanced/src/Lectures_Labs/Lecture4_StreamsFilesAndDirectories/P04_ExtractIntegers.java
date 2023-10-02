package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\input.txt";
        Scanner scanner = new Scanner(new FileInputStream(path));

        String pathForResults = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\Results\\P04_ExtractIntegers-Result.txt";
        PrintWriter printer = new PrintWriter(new FileOutputStream(pathForResults));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                printer.println(scanner.nextInt());
            }

            scanner.next();
        }

        printer.close();
    }
}
