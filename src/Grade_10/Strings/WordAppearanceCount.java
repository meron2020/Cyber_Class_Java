package Grade_10.Strings;
import java.util.*;

public class WordAppearanceCount {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a word >> ");
        String word = reader.nextLine();
        System.out.println("Enter a sentence >> ");
        String sentence = reader.nextLine();
        int appearanceCounter = 0;
        int indexCounter = 0;
        while (true){
            int index = sentence.indexOf(word, indexCounter);
            if (index == -1) {
                break;
            }
            indexCounter += (index + word.length());
            appearanceCounter++;

        }
        System.out.println(appearanceCounter);
    }
}
