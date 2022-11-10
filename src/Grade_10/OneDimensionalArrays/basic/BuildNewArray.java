package Grade_10.OneDimensionalArrays.basic;
import java.util.Arrays;

public class BuildNewArray {
    public static void main(String[] args) {
       int[] a = {1,321,432,14,2,432,12,46};
       int[] b = new int[a.length];
       for (int i = 0; i < a.length; i++) {
           int newNum = a[i] * 2;
           b[i] = newNum;
       }
       System.out.println(Arrays.toString(b));
    }
}
