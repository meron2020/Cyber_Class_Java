package OneDimensionalArrays.basic;
import java.util.*;
import java.util.Random;

public class Pairs {
    public int[] array;
    public int num;

    Pairs() {
        Random random = new Random();
        this.array = new int[random.nextInt(10)+5];
        this.num = 15;

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(this.array));
    }
    public void findCouples() {
        for (int i = 0; i < this.array.length-1; i++) {
            for (int j = i + 1; j < this.array.length; j++) {
                int sum = this.array[i] + this.array[j];
                int product = this.array[i] * this.array[j];
                if (sum == this.num | product == this.num) {
                    System.out.printf("(%d, %d)", this.array[i], this.array[j]);
                }
            }
        }
    }


    public static void main(String[] args) {
        Pairs pairs = new Pairs();
        pairs.findCouples();
    }
}
