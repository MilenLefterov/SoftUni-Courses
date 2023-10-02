package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class P07_ListFiles {
    public static void main(String[] args) throws IOException {

        File directoryPath = new File("src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\Files-and-Streams");

        File[] contents = directoryPath.listFiles();

        for (File e : contents) {
            if (e.isFile()) {
                System.out.printf("%s: [%d]\n", e.getName(), e.length());
            }
        }
    }
}
