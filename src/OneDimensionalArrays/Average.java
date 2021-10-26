package OneDimensionalArrays;

public class Average {
    public static void main(String[] args) {
        int[] a = {1, 321, 432, 14, 2, 432, 12, 46};
        int total = 0;
        int average;
        for (int num : a) {
            total += num;
        }
        average = total / a.length;
        System.out.println(average);

        for (int num : a) {
            if (num != average) {
                System.out.println(num);
            }
        }
    }
}