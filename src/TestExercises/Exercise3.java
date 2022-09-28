package TestExercises;

import java.util.Scanner;

public class Exercise3 {
    public static int[] allowedPlaces(int age) {
        int[] arrToReturn = new int[3];
        if (age >= 18) {
            for (int i = 0; i < 3; i++) {
                arrToReturn[i] = 1;
            }
        } else if (age >= 16) {
            for (int i = 0; i < 2; i++) {
                arrToReturn[i] = 1;
            }
        } else if (age >= 12) {
            arrToReturn[0] = 1;
        }
        return arrToReturn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] peopleAllowedPerPlace = new int[3];
        while (true) {
            System.out.println("Enter your age>> ");
            int age = scanner.nextInt();
            if (age < 12) {
                break;
            }
            int[] allowed = Exercise3.allowedPlaces(age);
            for (int i = 0; i < allowed.length; i++) {
                if (allowed[i] == 1) {
                    peopleAllowedPerPlace[i]++;
                }
            }
            System.out.println(peopleAllowedPerPlace[0] + " are allowed on the jumping board.");
            System.out.println(peopleAllowedPerPlace[1] + " are allowed in the jacuzzi.");
            System.out.println(peopleAllowedPerPlace[2] + " are allowed in the sauna.");
        }
    }
}
