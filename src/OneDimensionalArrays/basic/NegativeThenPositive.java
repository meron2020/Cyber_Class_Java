package OneDimensionalArrays.basic;

import java.util.Arrays;

public class NegativeThenPositive {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 5; i ++) {
            arr[2*i] = (int) (Math.random() * 10);
            arr[2*i+1] = (int) (Math.random() * (-10));
        }

        int counter = 0;

        int[] newArr = new int[10];
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                if (arr[i] < 0) {
                    newArr[counter] = arr[i];
                    counter++;
                }
            }
            else {
                if (arr[i - 10] > 0) {
                    newArr[counter] = arr[i - 10];
                    counter++;
                }
            }
        }


        System.out.println(Arrays.toString(newArr));
    }
}


