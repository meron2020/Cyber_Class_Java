package Grade_11.Recursion.ClassExercises;

public class Factorial {
    public static int factorial(int x) {
        if (x == 2) {
            return x;
        }
        return factorial(x-1) * x;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
