package Grade_11.Recursion.BookQuestions.P27;

public class Question18 {
    public static boolean primary(int num, int y) {
        if (y == 1) {
            return true;
        }
        if (num % y == 0) {
            return false;
        }
        return primary(num, y - 1);
    }

    public static boolean primary(int num) {
        return primary(num, num / 2);
    }

    public static boolean noPrimaryNumbersInArray(int[] array, int i) {
        if (i == array.length - 1) {
            return !primary(array[i]);
        }
        return !primary(array[i]) && noPrimaryNumbersInArray(array, i + 1);
    }

    public static boolean noPrimaryNumbersInArray(int[] array) {
        return noPrimaryNumbersInArray(array, 0);
    }

}
