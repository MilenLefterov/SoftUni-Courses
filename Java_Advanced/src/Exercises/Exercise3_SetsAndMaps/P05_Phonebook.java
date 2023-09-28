package Exercises.Exercise3_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBookMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"search".equals(input)) {
            String[] tokens = input.split("-");
            phoneBookMap.put(tokens[0], tokens[1]);

            input = scanner.nextLine();
        }
        
        input = scanner.nextLine();
        while (!"stop".equals(input)) {
            if (phoneBookMap.containsKey(input)) {
                System.out.printf("%s -> %s\n", input, phoneBookMap.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
            input = scanner.nextLine();
        }
    }
}
