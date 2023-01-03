package Grade_11.Recursion.ClassExercises;

public class Divide {
    public static int divide(int x, int y) {
        if (x > y) {
            return 0;
        }
        return divide(x, y-x) + 1;
    }

    public static void main(String[] args) {
        System.out.println(divide(5, 60));
    }
}
