package Strings;

import java.util.Scanner;

public class CoupleChange {
    public static String changeCouples(String input) {
        String newWord = "";
        for (int i = 0; i < input.length(); i+=2) {
            newWord += input.charAt(i+1);
            newWord += input.charAt(i);
        }

        return newWord;
    }

    public static void main(String[] args) {
        System.out.println(CoupleChange.changeCouples("good"));
    }
}
