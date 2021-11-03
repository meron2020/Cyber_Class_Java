package OneDimensionalArrays;
import java.util.*;

public class RandomNumberArray {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number >>");
        int n1 = scanner.nextInt();
        System.out.print("Enter a number >>");
        int n2 = scanner.nextInt();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int num = random.nextInt(Math.max(n1, n2) - Math.min(n1, n2)) + Math.min(n1, n2);
            array[i] = num;
    }
        System.out.println(Arrays.toString(array));
        int n1Frequency = 0;
        int n2Frequency = 0;
        for (int j : array) {
            if (j == n1) {
                n1Frequency++;
            } else if (j == n2) {
                n2Frequency++;
            }
        }
        System.out.printf("The number %d appears %d times",n1 ,n1Frequency);
        System.out.println();
        System.out.printf("The number %d appears %d times",n2 ,n2Frequency);
}}
