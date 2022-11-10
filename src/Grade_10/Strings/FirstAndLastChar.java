package Grade_10.Strings;
import java.util.*;

public class FirstAndLastChar {

    Scanner reader = new Scanner(System.in);
    public boolean checkChars() {
        System.out.println("Enter string >>");
        String str = reader.next();
        return str.charAt(0) == str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {
        FirstAndLastChar firstAndLastChar = new FirstAndLastChar();
        boolean equals = firstAndLastChar.checkChars();
        System.out.println(equals);
    }
}
