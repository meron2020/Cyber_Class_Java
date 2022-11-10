package Grade_10.OneDimensionalArrays.basic;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 4, 2, 2, -1, 31};
        int maximum = array[0];
        int minimum = array[0];
        for (int num : array) {
            if (num < minimum) {
                minimum = num;
            } else if (num > maximum) {
                maximum = num;
            }
        }
        int minimumCount = 0;
        int maximumCount = 0;
        for (int num: array) {
            if (num == minimum) {
                minimumCount++;
            }
            else if (num == maximum) {
                maximumCount++;
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(minimumCount);
        System.out.println(maximumCount);
    }
}
