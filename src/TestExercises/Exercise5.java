package TestExercises;

public class Exercise5 {
    public boolean function(int[] array) {
        if (array.length % 3 != 0) {
            return false;
        }
        int lastSum = 0;
        for (int i = 0; i < array.length; i += 3) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            if (sum < lastSum) {
                return false;
            }
            lastSum = sum;
        }

        return true;
    }
}
