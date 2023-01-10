package Grade_11.Recursion.ClassExercises;

public class CountElementsInArray {
    public static int countElementsInArray(int[] array) {
        return countElementsInArray(array, array.length-1);
    }

    public static int countElementsInArray(int[] arr, int i) {
        if (i == 0) {
            return arr[0];
        }
        return countElementsInArray(arr, i-1) + arr[i];
    }
}
