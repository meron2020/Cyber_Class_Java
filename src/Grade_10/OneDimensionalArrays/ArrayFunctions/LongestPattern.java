package Grade_10.OneDimensionalArrays.ArrayFunctions;

import java.util.Arrays;

public class LongestPattern {

    public int findLongestPattern(int[] array) {
        int maximumPatternLength = 1;
        int counter = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                counter++;
            }
            else {
                if (maximumPatternLength < counter) {
                    maximumPatternLength = counter;
                }
                counter = 1;
            }
        }
        return maximumPatternLength;
    }

    public static void main(String[] args) {
        LongestPattern longestPattern = new LongestPattern();
        int[] array = new int[(int) (Math.random() * 10 + 5)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(longestPattern.findLongestPattern(array));
    }
}
