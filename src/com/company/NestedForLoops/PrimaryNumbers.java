package com.company.NestedForLoops;

import java.util.Scanner;

public class PrimaryNumbers {
    public static void main(String[] args) {
        int totalPrimaryNums = 0;
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number >>");
            int num = scanner.nextInt();
            boolean primary = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    primary = false;
                    break;
                }
            }
            if (primary) {
                totalPrimaryNums ++;
            }
        }
        System.out.println(totalPrimaryNums);
    }
}
