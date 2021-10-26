package OneDimensionalArrays;

public class Totals {
    public static void main(String[] args) {
        int[] array = {123, 54, 545, 254, 3, 5453, 1, 513};
        int oddTotal = 0;
        int evenTotal = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                oddTotal += array[i];
            }
            else {
                evenTotal += array[i];
            }
        }
        if (oddTotal == evenTotal) {
            System.out.println("The total of the numbers in even indexes is equal.");

        }
        else {
            System.out.println("The total of the numbers in even indexes is not equal.");
        }
        System.out.println(oddTotal - evenTotal);
    }
}
