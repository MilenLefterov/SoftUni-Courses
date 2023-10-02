package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P03_CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        String pathForResults = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\03.CopyBytesOutput.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(pathForResults);

        int oneByte = fileInputStream.read();
        while (oneByte != -1) {

            if (oneByte == 32) {
                fileOutputStream.write(' ');
            } else if (oneByte == 10) {
                fileOutputStream.write('\n');
            } else {
                String message = String.valueOf(oneByte);

                for (Character ch : message.toCharArray()) {
                    fileOutputStream.write(ch);
                }
            }

            oneByte = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
