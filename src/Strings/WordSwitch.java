package Strings;

import java.util.Scanner;

public class WordSwitch {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a word >> ");
        String word = reader.nextLine();
        System.out.print("Enter a new word >> ");
        String newWord = reader.nextLine();
        System.out.println("Enter a sentence >> ");
        String sentence = reader.nextLine();
        System.out.println(sentence.replace(word, newWord));
}}
