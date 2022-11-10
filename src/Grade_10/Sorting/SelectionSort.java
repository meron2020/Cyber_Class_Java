package Grade_10.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] sortAlgorithm(int[] a) {
        int temp, pmin;
        for (int i = 0; i < a.length; i++) {
            pmin = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[pmin]) {
                    pmin = j;
                }
                temp = a[i];
                a[i] = a[pmin];
                a[pmin] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {4,123,1,35,1,431,1,23,4};
        int[] newArray = selectionSort.sortAlgorithm(array);
        System.out.println(Arrays.toString(newArray));
    }
}
