package Lectures_Labs.Lecture6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Songs {
    public static class Song {

        private String typeList;
        private String name;
        private String time;


        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;

        }

        public String getTypeList() {
            return this.typeList;
        }

        public String printSongName() {
            return this.name;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] songPartsArr = scanner.nextLine().split("_");

            Song currentSong = new Song(songPartsArr[0], songPartsArr[1], songPartsArr[2]);
            songsList.add(currentSong);
        }

        String wantedSongTypeList = scanner.nextLine();

        if (wantedSongTypeList.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.printSongName());
            }
        } else {
            for (Song song : songsList) {
                if (song.typeList.equals(wantedSongTypeList)) {
                    System.out.println(song.printSongName());

                }
            }
        }
    }
}