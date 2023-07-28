package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E04_ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> heroWithHP = new LinkedHashMap<>();
        Map<String, Integer> heroWithMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String name = inputData[0];
            int hp = Integer.parseInt(inputData[1]);
            int mp = Integer.parseInt(inputData[2]);
            if (hp <= 100 && mp <= 200) {
                heroWithHP.put(name, hp);
                heroWithMP.put(name, mp);
            }

        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split(" - ");
            switch (inputData[0]) {
                case "CastSpell":
                    int needMP = Integer.parseInt(inputData[2]);

                    int currentMP = heroWithMP.get(inputData[1]);
                    if (currentMP >= needMP) {
                        heroWithMP.put(inputData[1], currentMP - needMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                                inputData[1],
                                inputData[3],
                                heroWithMP.get(inputData[1]));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n",
                                inputData[1],
                                inputData[3]);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(inputData[2]);

                    if (heroWithHP.get(inputData[1]) - damage > 0) {
                        heroWithHP.put(inputData[1], heroWithHP.get(inputData[1]) - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                                inputData[1],
                                damage,
                                inputData[3],
                                heroWithHP.get(inputData[1]));
                    } else {
                        heroWithHP.remove(inputData[1]);
                        heroWithMP.remove(inputData[1]);
                        System.out.printf("%s has been killed by %s!\n",
                                inputData[1],
                                inputData[3]);
                    }
                    break;

                case "Recharge":
                    int currentHeroMP = heroWithMP.get(inputData[1]);
                    int mp = Integer.parseInt(inputData[2]);
                    int newMP = mp + currentHeroMP;

                    if (newMP > 200) {
                        newMP = 200;
                    }
                    heroWithMP.put(inputData[1], newMP);
                    System.out.printf("%s recharged for %d MP!\n",
                            inputData[1],
                            Math.abs(currentHeroMP - newMP));
                    break;
                case "Heal":
                    int currentHP = heroWithHP.get(inputData[1]);
                    int hp = Integer.parseInt(inputData[2]);
                    int newHP = hp + currentHP;

                    if (newHP > 100) {
                        newHP = 100;
                    }
                    heroWithHP.put(inputData[1], newHP);
                    System.out.printf("%s healed for %d HP!\n",
                            inputData[1],
                            Math.abs(currentHP - newHP));
                    break;
            }

            input = scanner.nextLine();
        }

        heroWithHP.forEach((key, value) -> System.out.printf("%s\n  HP: %d\n  MP: %s\n",
                key,
                value,
                heroWithMP.get(key)));
    }
}
