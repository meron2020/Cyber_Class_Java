package Grade_10.OneDimensionalArrays.basic;

public class Sorted {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                System.out.println("The array is unsorted");
                return;
            }
        }
        System.out.println("The array is sorted");
    }
}
