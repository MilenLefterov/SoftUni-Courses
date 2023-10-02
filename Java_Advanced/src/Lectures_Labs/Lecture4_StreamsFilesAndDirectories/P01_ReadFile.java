package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int oneByte = fileInputStream.read();
        while (oneByte != -1) {
            System.out.printf("%s ", Integer.toBinaryString(oneByte));
            oneByte = fileInputStream.read();
        }

        fileInputStream.close();
    }
}
