package TestExercises;

import java.util.Arrays;

public class Exercise4 {
    public static void function(int num) {
        int counter = 1;
        while (true) {
            if ((int) (num / Math.pow(10, counter)) == 0) {
                break;
            }
        counter++;
        }

        int[] array = new int[counter];
        for (int i = 0; i < array.length; i++) {
            int incompleteNum = (int) (num / Math.pow(10,counter-(i+1)));
            array[i] = (int) (incompleteNum % 10);
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Exercise4.function(1321);
    }
}
