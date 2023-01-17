package Grade_11.Recursion.BookQuestions.P27;

public class Question20 {
    public static boolean checkIfPalindrome(char[] array, int i, int j) {
        if (array.length == 2) {
            return array[0] == array[1];
        }
        if (array.length == 1) {
            return true;
        }

        return array[i] == array[array.length - 1] && checkIfPalindrome(array, i + 1, j - 1);
    }

    public static boolean isPali(char[] arr) {
        int n = arr.length - 1;
        int i1 = (int) (Math.random() * (n + 1));
        int i2 = (int) (Math.random() * (n + 1));

        if (i1 < i2) {
            return checkIfPalindrome(arr, i1, i2);
        }
        return checkIfPalindrome(arr, i2, i1);
    }
}
