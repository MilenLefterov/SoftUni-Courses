package ProgrammingFundamentalsFinalExam.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> peopleWithSend = new LinkedHashMap<>();
        Map<String, Integer> peopleWithReceived = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Statistics")) {
            String[] inputData = input.split("=");

            switch (inputData[0]) {
                case "Add":
                    int send = Integer.parseInt(inputData[2]);
                    int received = Integer.parseInt(inputData[3]);

                    peopleWithSend.putIfAbsent(inputData[1], send);
                    peopleWithReceived.putIfAbsent(inputData[1], received);
                    break;
                case "Message":
                    String u1 = inputData[1];
                    String u2 = inputData[2];

                    if (peopleWithSend.containsKey(u1) && peopleWithSend.containsKey(u2)) {
                        peopleWithSend.put(u1, peopleWithSend.get(u1) + 1);
                        peopleWithReceived.put(u2, peopleWithReceived.get(u2) + 1);

                        int sumU1 = peopleWithSend.get(u1) + peopleWithReceived.get(u1);
                        if (sumU1 >= capacity || sumU1 < 0) {
                            peopleWithSend.remove(u1);
                            peopleWithReceived.remove(u1);
                            System.out.printf("%s reached the capacity!\n", u1);
                        }

                        int sumU2 = peopleWithSend.get(u2) + peopleWithReceived.get(u2);
                        if (sumU2 >= capacity || sumU2 < 0) {
                            peopleWithSend.remove(u2);
                            peopleWithReceived.remove(u2);
                            System.out.printf("%s reached the capacity!\n", u2);
                        }
                    }
                    break;
                case "Empty":
                    String user = inputData[1];
                    if (user.equals("All")) {
                        peopleWithSend.clear();
                        peopleWithReceived.clear();
                    }

                    if (peopleWithSend.containsKey(user)) {
                        peopleWithSend.remove(user);
                        peopleWithReceived.remove(user);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Users count: %d\n", peopleWithReceived.size());
        peopleWithReceived.forEach((key, value) -> System.out.printf("%s - %d\n",
                key,
                (value + peopleWithSend.get(key))));
    }
}
