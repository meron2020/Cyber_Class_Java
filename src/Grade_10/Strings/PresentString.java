package Grade_10.Strings;
import java.util.*;


public class PresentString {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> strings = new ArrayList<String>();
    for (int i = 0; i < 5; i++) {
        System.out.println("Enter a string");
        String string = reader.next();
        strings.add(string);
    }

    for (String string: strings) {
        if (string.length() % 2 == 0) {
            System.out.println(string);
        }
    }

    }

}
