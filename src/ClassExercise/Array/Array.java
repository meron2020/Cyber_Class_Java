package ClassExercise.Array;

public class Array {

    public static int[] array(int[] arr1, int[] arr2) {
        int[] newArr = new int[Math.min(arr1.length, arr2.length)];
        int counter = 0;
        for (int j : arr1) {
            for (int k : arr2) {
                {
                    if (j == k) {
                        newArr[counter] = j;
                        counter++;
                    }
                }
            }

        }

        int[] arrToReturn = new int[counter];
        for (int i = 0; i < arrToReturn.length; i++) {
            arrToReturn[i] = newArr[i];
        }
        return arrToReturn;
    }
}
