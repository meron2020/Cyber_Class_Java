package OneDimensionalArrays.ArrayFunctions;

import OneDimensionalArrays.basic.Half;

public class HalfSortedArray {
    public boolean isHalfSorted(int[] array) {
        int halfArray = array.length / 2;
        int counter = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1] || array[i] == (array[i-1] + 1)) {
                counter++;
            }
            else {
                if (halfArray <= counter) {
                    return true;
                }
                else {
                    counter = 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {13, 32,3,2,5,6,3};
        HalfSortedArray halfSortedArray = new HalfSortedArray();
        boolean sorted = halfSortedArray.isHalfSorted(array);
        System.out.println(sorted);
    }
}
