package Grade_11.Recursion.BookQuestions.P26;

public class Question13 {
    public static int sumOfSquares(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return (int) Math.pow(sumOfSquares(num - 1), 2) + (int) Math.pow(sumOfSquares(num - 2), 2);
    }

    public static int sumOfAllPrior(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return sumOfSquares(num) + sumOfAllPrior(num -1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(5));
        System.out.println(sumOfAllPrior(5));
    }
}
