package Strings;
import java.util.*;


public class Password {
    public boolean checkIfCharInString(String enteredPassword, char[] listOfChar) {
        for (char numChar: listOfChar) {
            if (enteredPassword.indexOf(numChar) != -1) {
                return true;
            }
        }
        return false;
    }
    public boolean checkIfPassword(String enteredPassword) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] listOfNum = "0123456789".toCharArray();

        if (enteredPassword.length() >= 6) {
            if (checkIfCharInString(enteredPassword, alphabet)) {
                return checkIfCharInString(enteredPassword, listOfNum);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Password passChecker = new Password();
        boolean passwordEntered = false;
        while (!passwordEntered) {
        System.out.print("Password >>");
        String password = reader.next();

        if (passChecker.checkIfPassword(password)) {
            System.out.println("Password entered.");
            passwordEntered = true;
        }
        else {
            System.out.println("Password entered incorrectly.");
        }
    }}
}
