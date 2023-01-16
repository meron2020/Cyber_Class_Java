package Grade_11.Recursion.BookQuestions.P27;

public class Question15 {
    public static int positivesUntilNum(int[] array, int i) {
        if (i == 0) {
            if (array[i] > 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (array[i] > 0) {
            return 1 + positivesUntilNum(array, i - 1);
        }
        return positivesUntilNum(array, i - 1);
    }

}
