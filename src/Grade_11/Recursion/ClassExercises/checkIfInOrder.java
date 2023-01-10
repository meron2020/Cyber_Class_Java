package Grade_11.Recursion.ClassExercises;

public class checkIfInOrder {
    public static boolean inOrder(int[] arr) {
        return inOrder(arr, arr.length-1);
    }

    public static boolean inOrder(int[] array, int i) {
        if (i == array.length - 1) {
            return true;
        }
        return array[i] < array[i+1] && inOrder(array, i+1);
    }
}
