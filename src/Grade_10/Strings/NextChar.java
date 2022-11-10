package Grade_10.Strings;
import java.util.*;

public class NextChar {

    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string >> ");
        String str = reader.next();
        for (int i = 0; i < str.length() - 1; i++) {
            int charDistance = String.valueOf(str.charAt(i)).compareTo(String.valueOf(str.charAt(i + 1)));
            if (charDistance == -1) {
                System.out.println(str.charAt(i) + "" + str.charAt(i+1));
            }
        }
    }
}
