package OneDimensionalArrays;

import java.util.Arrays;

public class PairCheck {
    int aLength = (int) (Math.random() * 10) + 5;
    int bLength = aLength * 3 / 2;
    int[] a = new int[aLength];
    int[] b = new int[bLength];

    PairCheck () {
        for (int i = 0; i < aLength; i++ ) {
            a[i] = (int) (Math.random() * 10);
        }

        int iCounter = 0;
        for (int i = 0; i < b.length-1; i++) {
            if (i % 3 == 2) {
                iCounter++;
                if ((b[i-2] + b[i-1]) % 3 == 0) {
                    b[i] = (b[i-2] + b[i-1]);
                }
                else {
                    b[i] = 0;
                }
            }
            else {
                b[i] = a[i-iCounter];
            }
        }
    }

    public static void main(String[] args) {
        PairCheck pairCheck = new PairCheck();
        System.out.println(Arrays.toString(pairCheck.b));
    }



}
