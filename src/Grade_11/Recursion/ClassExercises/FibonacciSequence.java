package Grade_11.Recursion.ClassExercises;

public class FibonacciSequence {
    public static int fibonacci(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return fibonacci(i - 2) + fibonacci(i - 2);

    }

    public static void main(String[] args) {
        fibonacci(5);
    }
}
