package midExam.midExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sum = 0;
        for (int e : numList) {
            sum += e;
        }
        double avgNum = sum * 1.0 / numList.size();

        numList.removeIf(e -> e <= avgNum);
        Collections.sort(numList);
        Collections.reverse(numList);

        System.out.println(joinElementsByDelimiter(numList, " "));
    }

    public static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            if (i < items.size()) {
                result.append(items.get(i)).append(delimiter);
            }
        }
        if (result.length() <= 0) {
            return "No";
        }

        return result.toString();
    }
}
