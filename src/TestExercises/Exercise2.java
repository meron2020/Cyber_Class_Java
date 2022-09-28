package TestExercises;

import java.util.Scanner;

public class Exercise2 {

    public static int findMaxNum(int[] arr) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void findFinalFive() {
        Scanner scanner = new Scanner(System.in);
        int[] candidates = new int[11];
        int[] winners = new int[5];
        int counter = 0;
        while (true) {
            boolean allZeros = true;
            for (int i = 0; i < 5; i++) {
                int input = scanner.nextInt();
                if (input != 0) {
                    allZeros = false;
                }
                candidates[input]++;
            }
            if (allZeros) {
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            int currentMax = findMaxNum(candidates);
            winners[counter] = currentMax;
            candidates[currentMax] = 0;
            counter++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(winners[i]);
        }

    }

    public static void main(String[] args) {
        findFinalFive();
    }
}
