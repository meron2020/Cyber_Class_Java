package Grade_11.Recursion.ClassExercises;

public class RecursiveExponent {
    public static int recursiveExponent(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return recursiveExponent(x, y - 1) * x;
    }
}
