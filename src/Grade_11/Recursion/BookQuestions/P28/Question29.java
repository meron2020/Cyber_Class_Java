package Grade_11.Recursion.BookQuestions.P28;

public class Question29 {
    public static void numsByDifference(int num, int d, int n) {
        if (n > 0) {
            System.out.println(num);
            numsByDifference(num + d, d + 1, n-1);
        }
    }

    public static void main(String[] args) {
        numsByDifference(1, 1, 6);
    }
}
