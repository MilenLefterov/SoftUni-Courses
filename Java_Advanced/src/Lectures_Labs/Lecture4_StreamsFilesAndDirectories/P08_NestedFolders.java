package Lectures_Labs.Lecture4_StreamsFilesAndDirectories;

import java.io.File;
import java.util.*;

public class P08_NestedFolders {
    public static void main(String[] args) {

        String path = "src\\Lectures_Labs\\Lecture4_StreamsFilesAndDirectories\\Files\\Files-and-Streams";
        File root = new File(path);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();

            for (File nestedFile : Objects.requireNonNull(nestedFiles))
                if (nestedFile.isDirectory()) {
                    dirs.offer(nestedFile);
                }
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");
    }
}

