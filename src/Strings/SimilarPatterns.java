package Strings;

import java.util.*;


public class SimilarPatterns {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string >> ");
        String str = reader.next();
        int numOfDifferences = 1;
        for (int i = 0; i < str.length()-1; i++) {
            int distance = String.valueOf(str.charAt(i)).compareTo(String.valueOf(str.charAt(i+1)));
            if (distance != 0) {
                numOfDifferences++;
            }
        }
        System.out.println(numOfDifferences);
    }

}
