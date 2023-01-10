package Grade_11.Recursion.ClassExercises;

public class FindMaxInArr {
    public static int findMaxInArr(int[] arr) {
        return findMaxInArr(arr, 0);
    }

    public static int findMaxInArr(int[] arr, int i) {
        if (i == 0) {
            return arr[0];
        }

        return Math.max(arr[i], findMaxInArr(arr, i - 1));
    }
}
