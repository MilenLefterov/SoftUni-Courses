package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E01_ProgrammingFundamentalsFinalExamRetake;

import java.util.*;

public class P03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> songWithComposer = new LinkedHashMap<>();
        Map<String, String> songWithKey = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\|");
            songWithComposer.put(inputData[0], inputData[1]);
            songWithKey.put(inputData[0], inputData[2]);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] inputData = input.split("\\|");
            switch (inputData[0]) {
                case "Add":
                    if (songWithComposer.containsKey(inputData[1])) {
                        System.out.printf("%s is already in the collection!\n", inputData[1]);
                    } else {
                        songWithComposer.put(inputData[1], inputData[2]);
                        songWithKey.put(inputData[1], inputData[3]);
                        System.out.printf("%s by %s in %s added to the collection!\n",
                                inputData[1],
                                inputData[2],
                                inputData[3]);
                    }
                    break;

                case "Remove":
                    if (songWithComposer.containsKey(inputData[1])) {
                        songWithComposer.remove(inputData[1]);
                        songWithKey.remove(inputData[1]);
                        System.out.printf("Successfully removed %s!\n", inputData[1]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", inputData[1]);
                    }
                    break;

                case "ChangeKey":
                    if (songWithComposer.containsKey(inputData[1])) {
                        songWithKey.put(inputData[1], inputData[2]);
                        System.out.printf("Changed the key of %s to %s!\n", inputData[1], inputData[2]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", inputData[1]);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        songWithComposer.forEach((key, value) -> System.out.printf("%s -> Composer: %s, Key: %s\n",
                key,
                value,
                songWithKey.get(key)));
    }
}
