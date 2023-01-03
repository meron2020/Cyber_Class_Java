package Grade_11.Recursion.ClassExercises;

public class Remainder {
    public static int remainder(int x, int y) {
        if (x > y) {
            return y;
        }

        return remainder(x, y-x);
    }

    public static void main(String[] args) {
        System.out.println(remainder(5, 12));
    }
}
