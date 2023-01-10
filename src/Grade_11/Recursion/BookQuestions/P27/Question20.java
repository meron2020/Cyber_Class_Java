package Grade_11.Recursion.BookQuestions.P27;

public class Question20 {
    public static boolean checkIfPalindrome(char[] array, int i) {
        if (array.length == 2) {
            return array[0] == array[1];
        }
        if (array.length == 1) {
            return true;
        }

        return array[i] == array[array.length - 1] && checkIfPalindrome(array, i+1);
    }
}
