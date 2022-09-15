package ClassExercise;

public class Array {
    public static int[] array(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int k : arr2) {
                {
                    if (arr1[i] == k) {
                        newArr[i] = arr1[i];
                    }
                }
            }

        }
        return newArr;
    }
}
