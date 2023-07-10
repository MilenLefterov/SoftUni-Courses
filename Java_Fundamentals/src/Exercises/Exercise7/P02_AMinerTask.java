package Exercises.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> storage = new LinkedHashMap<>();

        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            storage.putIfAbsent(resource, 0);
            storage.put(resource, storage.get(resource) + quantity);

            resource = scanner.nextLine();
        }

        storage.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
