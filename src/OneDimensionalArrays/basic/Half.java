package OneDimensionalArrays.basic;

public class Half {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 1, 5, 9};
        int[] firstHalf = new int[array.length / 2];
        int[] secondHalf = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            firstHalf[i] = array[i];
            secondHalf[(array.length / 2) - (i+1)] = array[array.length-(i+1)];

        }
        boolean half = true;
        while (true) {
        for (int i = 0; i < firstHalf.length; i++) {
            if (firstHalf[i] != secondHalf[i]) {
                half = false;
                break;
            }
        }
        break;
        }
        if (half) {
            System.out.println("Halves were equal");
            return;
        }
        System.out.println("Halves were unequal");
    }
}
