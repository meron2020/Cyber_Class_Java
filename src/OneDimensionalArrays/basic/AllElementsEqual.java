package OneDimensionalArrays.basic;

public class AllElementsEqual {
    public static void main(String[] args) {
        int[] array = {123, 54, 545, 254, 3, 5453, 1, 513};
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i+1]) {
                System.out.println("Not all elements are equal");
                return;
            }
        }
        System.out.println("All elements are equal");
    }
}
