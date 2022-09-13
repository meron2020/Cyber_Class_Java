package com.company.NestedForLoops;

import java.util.Scanner;

public class LongestLastingPattern {
    public static void main(String[] args) {
        int longestPatternLength = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number >>");
        int inputLength = scanner.nextInt();
        int lastNum=0;
        int patternLength = 1;
        for (int i = 0; i < inputLength; i++) {
            System.out.println("Enter a number >>");
            int num = scanner.nextInt();
            if (i > 0)
                if (lastNum+1 == num) {
                    patternLength++;
                }
                else {
                    if (patternLength > longestPatternLength) {
                        longestPatternLength = patternLength;
                    }
                    patternLength = 1;
                }
            lastNum = num;
        }

        System.out.println(longestPatternLength);
    }
}
