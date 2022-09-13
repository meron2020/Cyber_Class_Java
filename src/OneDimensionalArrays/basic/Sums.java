package OneDimensionalArrays.basic;

import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter a number >> ");
            arr[i] = scanner.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            oddSum += arr[i];
            evenSum += arr[i+1];
        }

        if (evenSum == oddSum) {
            System.out.println("True");
        }
    }
}
