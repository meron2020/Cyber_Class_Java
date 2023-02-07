package Grade_11.Recursion.BookQuestions.P27;

public class Question23 {
    public static void reverseString(String word) {
        reverseString(word, 0);
    }

    public static void reverseString(String word, int i) {
        if (i < word.length() - 1) {
            reverseString(word, i+1);
        }
        System.out.print(word.charAt(i));
    }

    public static void main(String[] args) {
        reverseString("word");
    }
}
