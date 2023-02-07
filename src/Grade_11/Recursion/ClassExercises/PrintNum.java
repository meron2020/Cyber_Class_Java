package Grade_11.Recursion.ClassExercises;

public class PrintNum {
    public static void printDigit(int num) {
        if (num > 9) {
            printDigit(num / 10);
        }
        System.out.println(num % 10);
    }

    public static void main(String[] args) {
        printDigit(5412);
    }
}
