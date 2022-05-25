package OneDimensionalArrays.basic;

import java.util.Arrays;
import java.util.Random;

public class BiggestValue {
    static final int TOP = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[TOP];
        int[] b = new int[TOP];
        int[] c = new int[TOP];
        for (int i = 0; i < TOP; i++) {
            a[i] = random.nextInt(20);
            b[i] = random.nextInt(20);
        }
            for (int i = 0; i < TOP; i++) {
                if (a[i] > b[i]) {
                    c[i] = a[i];
                } else if (a[i] == b[i]) {
                    c[i] = 0;
                } else {
                    c[i] = b[i];
                }
            }
        System.out.println(Arrays.toString(c));
    }
}
