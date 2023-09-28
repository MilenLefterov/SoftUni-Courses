package Exercises.Exercise3_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailsMap = new LinkedHashMap<>();

        String name = scanner.nextLine();
        while (!"stop".equals(name)) {
            String email = scanner.nextLine();
            if (!(email.contains(".us") || email.contains(".uk") || email.contains(".com"))) {
                emailsMap.put(name, email);
            }
            name = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : emailsMap.entrySet()) {
            System.out.printf("%s -> %s\n",
                    entry.getKey(),
                    entry.getValue());
        }
    }
}
