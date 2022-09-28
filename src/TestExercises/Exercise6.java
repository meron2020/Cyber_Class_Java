package TestExercises;

public class Exercise6 {
    public static int stabilizingIndex(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int sumToTheLeft = 0;
            int sumToTheRight = 0;
            for (int j = 0; j < i; j++) {
                sumToTheLeft += array[j];
            }
            for (int j = i; j < array.length; j++) {
                sumToTheRight += array[j];
            }

            if (sumToTheLeft == sumToTheRight) {
                return i;
            }
        }
        return -1;
    }
}
