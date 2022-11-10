package Grade_10.Strings;
import java.util.*;

public class CharPresentInString {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string >> ");
        String str = reader.next();
        boolean numChar = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 10; j ++){
                if (Character.getNumericValue(str.charAt(i)) == j) {
                    numChar = true;
                }
            }
        }
        if (numChar) {
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }
    }
}
