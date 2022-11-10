package Grade_10.OneDimensionalArrays.basic;
import java.util.Arrays;
import java.util.Random;

public class MostFrequentIndex {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            int num = random.nextInt(2);
            if (num == 0) {
                array[i] = 1;

            }
            else {
                array[i] = 6;
            }
        }
        int numOneCounter = 0;
        int numSixCounter = 0;
        int moreFrequent = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                numOneCounter++;
            }
            else {
                numSixCounter++;
            }
        }
        if (numOneCounter > numSixCounter) {
            moreFrequent = 1;
        }
        else {
            moreFrequent = 6;
        }
        System.out.println(moreFrequent);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == moreFrequent) {
                System.out.println(i);
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
