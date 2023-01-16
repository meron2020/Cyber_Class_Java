package Grade_11.Recursion.BookQuestions.P27;

public class Question21 {
    public static int lowercaseLetters(String word) {
        char letter = word.charAt(0);
        if (word.length() == 1) {
            if ((int) letter <= 122 && letter >= 97) {
                return 1;
            }
            return 0;
        }
        if ((int) letter <= 122 && letter >= 97) {
            return 1 + lowercaseLetters(word.substring(1, word.length()));
        }
        return lowercaseLetters(word.substring(1, word.length()));

    }

    public static void main(String[] args) {
        System.out.println(lowercaseLetters("Hello"));
    }
}
