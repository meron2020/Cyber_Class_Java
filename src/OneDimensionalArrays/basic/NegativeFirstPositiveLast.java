package OneDimensionalArrays.basic;

import java.util.Arrays;

public class NegativeFirstPositiveLast {
    public int arrayLength = (int) (Math.random()*10);
    public int[] array = new int[arrayLength];

    NegativeFirstPositiveLast() {
        for (int i = 0; i < arrayLength; i++) {
            array[i] = negativeOrPositive((int) (Math.random() * (10) + 1));
        }
    }

    public int negativeOrPositive(int number) {
        int posOrNeg = (int) (Math.random() * 2);
        if (posOrNeg == 1) {
            number = -number;
        }
        return number;
    }

    public int[] sort() {
        int[] newArray = new int[this.array.length];
        int negativeCounter = 0;
        for (int k : this.array) {
            if (k < 0) {
                newArray[negativeCounter] = k;
                negativeCounter++;
            }

        }
        int positiveCounter = 0;
        for (int j : this.array) {
            if (j > 0) {
                newArray[positiveCounter + negativeCounter] = j;
                positiveCounter++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        NegativeFirstPositiveLast negativeFirstPositiveLast = new NegativeFirstPositiveLast();
        int[] array = negativeFirstPositiveLast.sort();
        System.out.println(Arrays.toString(array));

    }
}
