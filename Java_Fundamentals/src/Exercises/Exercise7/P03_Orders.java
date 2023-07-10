package Exercises.Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productsPriceMap = new LinkedHashMap<>();
        Map<String, Integer> productsQuantityMap = new LinkedHashMap<>();

        while (true) {
            String[] inputData = scanner.nextLine().split("\\s+");

            if (inputData[0].equals("buy")) {
                break;
            }

            productsPriceMap.put(inputData[0], Double.parseDouble(inputData[1]));
            productsQuantityMap.putIfAbsent(inputData[0], 0);
            productsQuantityMap.put(inputData[0],
                    productsQuantityMap.get(inputData[0]) + Integer.parseInt(inputData[2])
            );

        }

        productsPriceMap.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value * productsQuantityMap.get(key)));
    }
}
