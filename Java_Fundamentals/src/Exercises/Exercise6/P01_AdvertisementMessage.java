package Exercises.Exercise6;

import java.util.Random;
import java.util.Scanner;

public class P01_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrasesArr = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };
        String[] eventsArr = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        String[] authorsArr = {"Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };
        String[] citiesArr = {"Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };

        int numPhrases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numPhrases; i++) {
            int rndPhrase = new Random().nextInt(phrasesArr.length);
            int rndEvent = new Random().nextInt(eventsArr.length);
            int rndAuthor = new Random().nextInt(authorsArr.length);
            int rndCity = new Random().nextInt(citiesArr.length);

            System.out.printf("%s %s %s – %s\n",
                    phrasesArr[rndPhrase], eventsArr[rndEvent],
                    authorsArr[rndAuthor], citiesArr[rndCity]
            );
        }


    }
}
