package Lectures_Labs.Lecture3_SetsAndMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vipSet = new TreeSet<>();
        Set<String> guestSet = new TreeSet<>();

        String input = scanner.nextLine();
        while (!"PARTY".equals(input)) {

            if (Character.isDigit(input.charAt(0))) {
                vipSet.add(input);
            } else {
                guestSet.add(input);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!"END".equals(input)) {

            vipSet.remove(input);
            guestSet.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(vipSet.size() + guestSet.size());

        for (String currentVipGuest : vipSet) {
            System.out.println(currentVipGuest);
        }
        for (String currentGuest : guestSet) {
            System.out.println(currentGuest);
        }

    }
}
