package Lectures_Labs.Lecture3_SetsAndMaps;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class P06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> dataMap = new TreeMap<>();

        String input = scanner.nextLine();
        while (!"Revision".equals(input)) {
            String[] elements = input.split(", ");

            String shopName = elements[0];
            String productName = elements[1];
            Double price = Double.parseDouble(elements[2]);

            dataMap.putIfAbsent(shopName, new LinkedHashMap<>());
            dataMap.get(shopName).put(productName, price);

            input = scanner.nextLine();
        }

        for (var currentShop : dataMap.entrySet()) {
            System.out.printf("%s->\n", currentShop.getKey());
            for (var currentProduct : currentShop.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n",
                        currentProduct.getKey(), currentProduct.getValue());
            }

        }
    }
}
