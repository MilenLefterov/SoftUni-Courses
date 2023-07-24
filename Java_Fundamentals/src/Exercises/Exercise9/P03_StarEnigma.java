package Exercises.Exercise9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "@(?<planetName>[A-Za-z]+)[^@:!\\->]*:(?<population>\\d+)[^@:!\\->]*!(?<attack>[A|D])![^@:!\\->]*\\->(?<soldiers>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanetsList = new ArrayList<>();
        List<String> destroyedPlanetsL = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            int key = 0;
            for (Character currentChar : input.toCharArray()) {
                if (Character.isLetter(currentChar)) {
                    if (currentChar == 's' || currentChar == 'S' ||
                            currentChar == 't' || currentChar == 'T' ||
                            currentChar == 'a' || currentChar == 'A' ||
                            currentChar == 'r' || currentChar == 'R') {
                        key++;
                    }
                }
            }

            StringBuilder result = new StringBuilder();
            for (Character currentChar : input.toCharArray()) {
                result.append((char) (currentChar - key));
            }

            Matcher matcher = pattern.matcher(result);
            if (matcher.find()) {
                if (matcher.group("attack").equals("A")) {
                    attackedPlanetsList.add(matcher.group("planetName"));
                } else if (matcher.group("attack").equals("D")) {
                    destroyedPlanetsL.add(matcher.group("planetName"));
                }
            }
        }

        System.out.printf("Attacked planets: %d\n", attackedPlanetsList.size());
        Collections.sort(attackedPlanetsList);
        for (String e : attackedPlanetsList) {
            System.out.printf("-> %s\n", e);
        }
        
        System.out.printf("Destroyed planets: %d\n", destroyedPlanetsL.size());
        Collections.sort(destroyedPlanetsL);
        for (String e : destroyedPlanetsL) {
            System.out.printf("-> %s\n", e);
        }
    }
}
