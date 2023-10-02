package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\input.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        String pathForResults = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\Results\\P05_WriteEveryThirdLine-Result.txt";
        PrintWriter printer = new PrintWriter(new FileOutputStream(pathForResults));

        String line = reader.readLine();
        int count = 1;

        while (line != null) {
            if (count % 3 == 0) {
                printer.println(line);
            }
            count++;
            line = reader.readLine();
        }

        printer.close();
    }
}

