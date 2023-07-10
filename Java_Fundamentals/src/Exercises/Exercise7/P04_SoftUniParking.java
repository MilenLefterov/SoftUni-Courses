package Exercises.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            switch (inputData[0]) {
                case "register":
                    if (parkingMap.containsKey(inputData[1])) {
                        System.out.printf("ERROR: already registered with plate number %s\n", parkingMap.get(inputData[1]));
                    } else {
                        parkingMap.put(inputData[1], inputData[2]);
                        System.out.printf("%s registered %s successfully\n", inputData[1], inputData[2]);
                    }
                    break;
                case "unregister":
                    if (!parkingMap.containsKey(inputData[1])) {
                        System.out.printf("ERROR: user %s not found\n", inputData[1]);
                    } else {
                        parkingMap.remove(inputData[1]);
                        System.out.printf("%s unregistered successfully\n", inputData[1]);
                    }
                    break;
            }
        }

        parkingMap.forEach((key, value) -> System.out.printf("%s => %s\n", key, value));
    }
}
