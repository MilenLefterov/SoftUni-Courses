package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class P06_SortLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\input.txt");

        List<String> lines = Files.readAllLines(path);

        Path outputPath = Paths.get("src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\06.SortLinesOutput.txt");

        Collections.sort(lines);

        Files.write(outputPath, lines);
    }
}
