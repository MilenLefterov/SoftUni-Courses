package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class P02_WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        String pathForResults = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\Results\\P02_WriteToFile-Result.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(pathForResults);

        Set<Character> punctuationsSet = Set.of(',', '.', '!', '?');

        int oneByte = fileInputStream.read();
        while (oneByte != -1) {

            char currentSymbol = (char) oneByte;

            if (!punctuationsSet.contains(currentSymbol)) {
                fileOutputStream.write(currentSymbol);
            }

            oneByte = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
