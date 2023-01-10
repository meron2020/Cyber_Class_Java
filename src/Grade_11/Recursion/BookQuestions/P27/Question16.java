package Grade_11.Recursion.BookQuestions.P27;

public class Question16 {

    public static int return_Index(int[] array, int num) {
        return returnIndex(array, num, 0);

    }

    public static int returnIndex(int[] array, int num, int i) {
        if (i == array.length - 1) {
            if (array[i] != num) {
                return -1;
            }
            return num;
        }
        return returnIndex(array, num, i + 1);
    }
}
