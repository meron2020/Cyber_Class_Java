package Grade_10.TestPractice;

import java.util.Random;
import java.util.Scanner;

public class TestPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftAndRightDigitsNum = 0;
        int maxAverage = 0;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10000);
            int digits = 0;
            while ((int) (num / Math.pow(10, digits)) != 0) {
                digits += 1;
            }
            if (num % 10 == num / Math.pow(10, digits-1)) {
                leftAndRightDigitsNum += 1;
            }
            int sum = 0, average = 0;
            for (int j = 0; j < digits; j++) {
                int digit = (int) ((num % Math.pow(10, j+1)) / Math.pow(10, j));
                sum += digit; }

            average = sum / digits;
            System.out.println(average);

            if (average > maxAverage) {
                maxAverage = average;
            }
        }

        System.out.println("Max Average: " + maxAverage);
        System.out.println("Left and Right Digits: " + leftAndRightDigitsNum);
    }
}
